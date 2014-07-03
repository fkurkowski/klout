package br.com.alpha6.klout;

import br.com.alpha6.klout.exception.KloutException;
import br.com.alpha6.klout.model.Identity;
import br.com.alpha6.klout.model.Influence;
import br.com.alpha6.klout.model.Network;
import br.com.alpha6.klout.model.Score;
import br.com.alpha6.klout.model.Topic;
import br.com.alpha6.klout.model.User;

/**
 * Defines the available operations on the Klout API.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public interface KloutAPI {

	/**
	 * Returns the Klout {@link Identity} of a social network user by its id.
	 *
	 * @param network social network
	 * @param id user id on the social network
	 * @return klout id of the user
	 * @throws KloutException
	 */
	public Identity getKloutId(Network network, String id) throws KloutException;

	/**
	 * Returns the Klout {@link Identity} of a Twitter user by its screen name.
	 *
	 * @param screenName twitter screen name
	 * @return user's klout id
	 * @throws KloutException
	 */
	public Identity getKloutIdFromTwitterScreenName(String screenName) throws KloutException;

	/**
	 * Returns the Twitter {@link Identity} of a Klout user by its id.
	 *
	 * @param kloutId user's klout id
	 * @return user's twitter id
	 * @throws KloutException
	 */
	public Identity getTwitterIdFromKloutId(String kloutId) throws KloutException;

	/**
	 * Returns the {@link User} associated to a Klout id.
	 *
	 * @param kloutId klout id
	 * @return the user
	 * @throws KloutException
	 */
	public User showUser(String kloutId) throws KloutException;

	/**
	 * Returns the {@link Score} associated to a Klout id.
	 *
	 * @param kloutId klout id
	 * @return user's score
	 * @throws KloutException
	 */
	public Score getScore(String kloutId) throws KloutException;

	/**
	 * Returns the {@link Topic}s associated to a Klout id.
	 *
	 * @param kloutId klout id
	 * @return user's topics
	 * @throws KloutException
	 */
	public Topic[] getTopics(String kloutId) throws KloutException;

	/**
	 * Returns the {@link Influence} associated to a Klout id.
	 *
	 * @param kloutId klout id
	 * @return user's influence
	 * @throws KloutException
	 */
	public Influence getInfluence(String kloutId) throws KloutException;
}