package br.com.alpha6.klout;

import java.io.IOException;
import java.net.HttpURLConnection;

import br.com.alpha6.klout.exception.ForbiddenException;
import br.com.alpha6.klout.exception.KloutException;
import br.com.alpha6.klout.exception.NotFoundException;
import br.com.alpha6.klout.exception.UnavailableException;
import br.com.alpha6.klout.http.DefaultWebRequester;
import br.com.alpha6.klout.http.Response;
import br.com.alpha6.klout.http.WebRequester;
import br.com.alpha6.klout.mapper.GsonMapper;
import br.com.alpha6.klout.mapper.Mapper;
import br.com.alpha6.klout.model.Identity;
import br.com.alpha6.klout.model.Influence;
import br.com.alpha6.klout.model.Network;
import br.com.alpha6.klout.model.Score;
import br.com.alpha6.klout.model.Topic;
import br.com.alpha6.klout.model.User;

/**
 * Default {@link KloutAPI} implementation.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class Klout implements KloutAPI {

	private static final String BASE_URL = "http://api.klout.com/v2/";
	private static final String IDENTITY_URL = BASE_URL + "identity.json/%s/%s?key=%s";
	private static final String IDENTITY_SCREEN_NAME_URL = BASE_URL + "identity.json/twitter?screenName=%s&key=%s";
	private static final String IDENTITY_KLOUT_URL = BASE_URL + "identity.json/klout/%s/tw?key=%s";
	private static final String USER_URL = BASE_URL + "user.json/%s?key=%s";
	private static final String SCORE_URL = BASE_URL + "user.json/%s/score?key=%s";
	private static final String TOPICS_URL = BASE_URL + "user.json/%s/topics?key=%s";
	private static final String INFLUENCE_URL = BASE_URL + "user.json/%s/influence?key=%s";

	private String apiKey;
	private WebRequester requester;
	private Mapper mapper;

	/**
	 * Creates a new Klout client.
	 *
	 * @param apiKey Klout API key
	 */
	public Klout(String apiKey) {
		this(apiKey, new DefaultWebRequester(), new GsonMapper());
	}

	/**
	 * Creates a new Klout client.
	 *
	 * @param apiKey Klout API key
	 * @param requester an web requester
	 */
	public Klout(String apiKey, WebRequester requester) {
		this(apiKey, requester, new GsonMapper());
	}

	/**
	 * Creates a new Klout client.
	 *
	 * @param apiKey Klout API key
	 * @param requester an web requester
	 * @param mapper an response mapper
	 */
	public Klout(String apiKey, WebRequester requester, Mapper mapper) {
		this.apiKey = apiKey;
		this.requester = requester;
		this.mapper = mapper;
	}

	/**
	 * Makes a HTTP GET request to an URL and maps the response.
	 *
	 * @param url endpoint
	 * @param clazz class to map the response to
	 * @return the response mapped to the specified class
	 * @throws KloutException
	 */
	private <T> T makeRequest(String url, Class<T> clazz) throws KloutException {
		Response response;
		
		try {
			response = requester.get(url);
		} catch (IOException e) {
			throw new KloutException(e);
		}
		
		switch (response.getCode()) {
			case HttpURLConnection.HTTP_FORBIDDEN:
				throw new ForbiddenException();
			case HttpURLConnection.HTTP_UNAVAILABLE:
			case HttpURLConnection.HTTP_GATEWAY_TIMEOUT:
				throw new UnavailableException();
			case HttpURLConnection.HTTP_NOT_FOUND:
				throw new NotFoundException();
			case HttpURLConnection.HTTP_OK:
				return mapper.map(response.getBody(), clazz);
			default:
				throw new KloutException(response.getBody());
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public Identity getKloutId(Network network, String id) throws KloutException {
		String url = String.format(IDENTITY_URL, network, id, apiKey);
		return makeRequest(url, Identity.class);
	}

	/**
	 * {@inheritDoc}
	 */
	public Identity getKloutIdFromTwitterScreenName(String screenName) throws KloutException {
		String url = String.format(IDENTITY_SCREEN_NAME_URL, screenName, apiKey);
		return makeRequest(url, Identity.class);
	}

	/**
	 * {@inheritDoc}
	 */
	public Identity getTwitterIdFromKloutId(String kloutId) throws KloutException {
		String url = String.format(IDENTITY_KLOUT_URL, kloutId, apiKey);
		return makeRequest(url, Identity.class);
	}

	/**
	 * {@inheritDoc}
	 */
	public User showUser(String kloutId) throws KloutException {
		String url = String.format(USER_URL, kloutId, apiKey);
		return makeRequest(url, User.class);
	}

	/**
	 * {@inheritDoc}
	 */
	public Score getScore(String kloutId) throws KloutException {
		String url = String.format(SCORE_URL, kloutId, apiKey);
		return makeRequest(url, Score.class);
	}

	/**
	 * {@inheritDoc}
	 */
	public Topic[] getTopics(String kloutId) throws KloutException {
		String url = String.format(TOPICS_URL, kloutId, apiKey);
		return makeRequest(url, Topic[].class);
	}

	/**
	 * {@inheritDoc}
	 */
	public Influence getInfluence(String kloutId) throws KloutException {
		String url = String.format(INFLUENCE_URL, kloutId, apiKey);
		return makeRequest(url, Influence.class);
	}
}