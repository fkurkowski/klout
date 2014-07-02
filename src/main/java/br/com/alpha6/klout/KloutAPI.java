package br.com.alpha6.klout;

import br.com.alpha6.klout.model.Identity;
import br.com.alpha6.klout.model.Influence;
import br.com.alpha6.klout.model.Network;
import br.com.alpha6.klout.model.Score;
import br.com.alpha6.klout.model.Topic;
import br.com.alpha6.klout.model.User;

public interface KloutAPI {
	public Identity getKloutId(Network network, String id);

	public Identity getKloutIdFromTwitterScreenName(String screenName);

	public Identity getTwitterIdFromKloutId(String kloutId);

	public User showUser(String kloutId);

	public Score getScore(String kloutId);

	public Topic[] getTopics(String kloutId);

	public Influence getInfluence(String kloutId);
}