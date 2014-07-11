package br.com.alpha6.klout.model;

import java.util.List;

/**
 * Basically, this class contain all the influence information returned
 * by Klout's API. An user can both influence and be influenced by other
 * users.
 */
public class Influence {

	private List<User> influencers;
	private List<User> influencees;
	private int influencersCount;
	private int influenceesCount;

	/**
	 * Creates a new instance of this class.
	 */
	public Influence() {
	}

	/**
	 * Creates a new instance of this class with the influence information
	 * associated to an user.
	 *
	 * @param influencers      users that influence the user (influencers).
	 * @param influencees      users influenced by the user (influencees).
	 * @param influencersCount number of influencers.
	 * @param influenceesCount number of influencees.
	 */
	public Influence(List<User> influencers, List<User> influencees,
	                 int influencersCount, int influenceesCount) {
		this.influencers = influencers;
		this.influencees = influencees;
		this.influencersCount = influencersCount;
		this.influenceesCount = influenceesCount;
	}

	/**
	 * Returns a list with the users that influence the user.
	 *
	 * @return influencers
	 */
	public List<User> getInfluencers() {
		return influencers;
	}

	/**
	 * Defines the user's influencers.
	 *
	 * @param influencers influencers of the user.
	 */
	public void setInfluencers(List<User> influencers) {
		this.influencers = influencers;
	}

	/**
	 * Returns a list with the users influenced by the user.
	 *
	 * @return influencees.
	 */
	public List<User> getInfluencees() {
		return influencees;
	}

	/**
	 * Defines the user's influencees.
	 *
	 * @param influencees a list with the users influenced by the user.
	 */
	public void setInfluencees(List<User> influencees) {
		this.influencees = influencees;
	}

	/**
	 * Returns the number of influencers.
	 *
	 * @return number of influencers.
	 */
	public int getInfluencersCount() {
		return influencersCount;
	}

	/**
	 * Defines the number of influencers.
	 *
	 * @param influencersCount the number of influencers.
	 */
	public void setInfluencersCount(int influencersCount) {
		this.influencersCount = influencersCount;
	}

	/**
	 * Returns the number of influencees.
	 *
	 * @return number of influencees.
	 */
	public int getInfluenceesCount() {
		return influenceesCount;
	}

	/**
	 * Defines the number of influencees.
	 *
	 * @param influenceesCount the number of influencees.
	 */
	public void setInfluenceesCount(int influenceesCount) {
		this.influenceesCount = influenceesCount;
	}

	@Override
	public String toString() {
		return "Influence{" +
				"influencers=" + influencers +
				", influencees=" + influencees +
				", influencersCount=" + influencersCount +
				", influenceesCount=" + influenceesCount +
				'}';
	}
}
