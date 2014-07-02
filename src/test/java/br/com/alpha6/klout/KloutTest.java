package br.com.alpha6.klout;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import br.com.alpha6.klout.http.DefaultWebRequester;
import br.com.alpha6.klout.http.JSONReader;
import br.com.alpha6.klout.http.Response;
import br.com.alpha6.klout.http.WebRequester;
import org.junit.Before;
import org.junit.Test;

import br.com.alpha6.klout.model.Identity;
import br.com.alpha6.klout.model.Influence;
import br.com.alpha6.klout.model.Network;
import br.com.alpha6.klout.model.Score;
import br.com.alpha6.klout.model.Topic;
import br.com.alpha6.klout.model.User;

public class KloutTest {

	private KloutAPI klout;
	private WebRequester requester;

	private static final String API_KEY = "API.KEY";
	private static final String TWITTER_ID = "26565946";
	private static final String TWITTER_SCREEN_NAME = "jtimberlake";
	private static final String KLOUT_ID = "635263";

	@Before
	public void setUp() {
		requester = mock(WebRequester.class);
		klout = new Klout(API_KEY, requester);
	}

	private void mockResponse(String jsonPath) throws Exception {
		String body = JSONReader.asString(jsonPath);

		when(requester.get(anyString()))
				.thenReturn(new Response(200, body));
	}


	@Test
	public void shouldGetKloutId() throws Exception {
		mockResponse("id_ks");

		Identity identity = klout.getKloutId(Network.TWITTER, TWITTER_ID);
		assertEquals(KLOUT_ID, identity.getId());
	}

	@Test
	public void shouldGetKloutIdFromTwitterScreenName() throws Exception {
		mockResponse("id_ks");

		Identity identity = klout.getKloutIdFromTwitterScreenName(TWITTER_SCREEN_NAME);
		assertEquals(KLOUT_ID, identity.getId());
	}

	@Test
	public void shouldGetTwitterIdFromKloutId() throws Exception {
		mockResponse("id_tw");

		Identity identity = klout.getTwitterIdFromKloutId(KLOUT_ID);
		assertEquals(TWITTER_ID, identity.getId());
	}

	@Test
	public void shouldShowUser() throws Exception {
		mockResponse("user");

		User user = klout.showUser(KLOUT_ID);
		assertEquals(TWITTER_SCREEN_NAME, user.getNick());
	}

	@Test
	public void shouldGetScore() throws Exception {
		mockResponse("score");

		Score score = klout.getScore(KLOUT_ID);
		assertNotNull(score);
	}

	@Test
	public void shouldGetTopics() throws Exception {
		mockResponse("topics");

		Topic[] topics = klout.getTopics(KLOUT_ID);
		assertTrue(topics.length > 0);
	}

	@Test
	public void shouldGetInfluence() throws Exception {
		mockResponse("influence");

		Influence influence = klout.getInfluence(KLOUT_ID);
		assertNotNull(influence);
	}
}
