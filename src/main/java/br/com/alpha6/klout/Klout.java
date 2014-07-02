package br.com.alpha6.klout;

import br.com.alpha6.klout.http.DefaultWebRequester;
import br.com.alpha6.klout.http.WebRequester;
import br.com.alpha6.klout.mapper.GsonMapper;
import br.com.alpha6.klout.mapper.Mapper;
import br.com.alpha6.klout.model.Identity;
import br.com.alpha6.klout.model.Influence;
import br.com.alpha6.klout.model.Network;
import br.com.alpha6.klout.model.Score;
import br.com.alpha6.klout.model.Topic;
import br.com.alpha6.klout.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Klout implements KloutAPI {

	/**
	 * Logger
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

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

	public Klout(String apiKey) {
		this(apiKey, new DefaultWebRequester(), new GsonMapper());
	}

	public Klout(String apiKey, WebRequester requester) {
		this(apiKey, requester, new GsonMapper());
	}

	public Klout(String apiKey, WebRequester requester, Mapper mapper) {
		this.apiKey = apiKey;
		this.requester = requester;
		this.mapper = mapper;
	}

	private <T> T makeRequest(String url, Class<T> clazz) {
		try {
			return mapper.map(requester.get(url).getBody(), clazz);
		} catch (IOException e) {
			if (logger.isWarnEnabled()) {
				logger.warn("Could not fetch resource at {}", url);
			}
		}

		return null;
	}

	public Identity getKloutId(Network network, String id) {
		String url = String.format(IDENTITY_URL, network, id, apiKey);
		return makeRequest(url, Identity.class);
	}

	public Identity getKloutIdFromTwitterScreenName(String screenName) {
		String url = String.format(IDENTITY_SCREEN_NAME_URL, screenName, apiKey);
		return makeRequest(url, Identity.class);
	}

	public Identity getTwitterIdFromKloutId(String kloutId) {
		String url = String.format(IDENTITY_KLOUT_URL, kloutId, apiKey);
		return makeRequest(url, Identity.class);
	}

	public User showUser(String kloutId) {
		String url = String.format(USER_URL, kloutId, apiKey);
		return makeRequest(url, User.class);
	}

	public Score getScore(String kloutId) {
		String url = String.format(SCORE_URL, kloutId, apiKey);
		return makeRequest(url, Score.class);
	}

	public Topic[] getTopics(String kloutId) {
		String url = String.format(TOPICS_URL, kloutId, apiKey);
		return makeRequest(url, Topic[].class);
	}

	public Influence getInfluence(String kloutId) {
		String url = String.format(INFLUENCE_URL, kloutId, apiKey);
		return makeRequest(url, Influence.class);
	}
}