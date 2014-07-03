package br.com.alpha6.klout.model;

/**
 * A Klout user.
 */
public class User {

	/**
	 * ID on Klout.
	 */
	public String kloutId;

	/**
	 * Screen name.
	 */
	public String nick;

	public Score score;
	public ScoreDeltas scoreDeltas;

	/**
	 * Returns the user ID on Klout.
	 *
	 * @return user ID on Klout
	 */
	public String getKloutId() {
		return kloutId;
	}

	/**
	 * Returns the user screen name.
	 *
	 * @return user screen name.
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * Returns the user score.
	 *
	 * @return user score
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * Returns the user score changes for the past day, week and month.
	 *
	 * @return the user score changes.
	 */
	public ScoreDeltas getScoreDeltas() {
		return scoreDeltas;
	}

	@Override
	public String toString() {
		return "User{" +
				"kloutId='" + kloutId + '\'' +
				", nick='" + nick + '\'' +
				", score=" + score +
				", scoreDeltas=" + scoreDeltas +
				'}';
	}
}
