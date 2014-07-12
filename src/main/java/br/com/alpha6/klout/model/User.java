package br.com.alpha6.klout.model;

/**
 * A Klout user.
 */
public class User {

	public String kloutId;
	public String nick;
	public Score score;
	public ScoreDeltas scoreDeltas;
	
	/**
	 * Creates a new instance of this class
	 */
	public User() {}

	/**
	 * Creates a new instance of this class with user information
	 * 
	 * @param kloutId the user ID on Klout.
	 * @param nick the user screen name.
	 * @param score the user score.
	 * @param scoreDeltas the user score changes for the past day, week and month.
	 */
	public User(String kloutId, String nick, Score score, ScoreDeltas scoreDeltas) {
		this.kloutId = kloutId;
		this.nick = nick;
		this.score = score;
		this.scoreDeltas = scoreDeltas;
	}

	/**
	 * Returns the user ID on Klout.
	 *
	 * @return user ID on Klout
	 */
	public String getKloutId() {
		return kloutId;
	}

	/**
	 * Defines the user ID on Klout.
	 * 
	 * @param kloutId the user ID on Klout.
	 */
	public void setKloutId(String kloutId) {
		this.kloutId = kloutId;
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
	 * Defines the user screen name.
	 * 
	 * @param nick the user screen name.
	 */
	public void setNick(String nick) {
		this.nick = nick;
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
	 * Defines the user score.
	 * 
	 * @param score the user score.
	 */
	public void setScore(Score score) {
		this.score = score;
	}

	/**
	 * Returns the user score changes for the past day, week and month.
	 *
	 * @return the user score changes.
	 */
	public ScoreDeltas getScoreDeltas() {
		return scoreDeltas;
	}

	/**
	 * Defines the user score changes for the past day, week and month.
	 * 
	 * @param scoreDeltas the user score changes for the past day, week and month.
	 */
	public void setScoreDeltas(ScoreDeltas scoreDeltas) {
		this.scoreDeltas = scoreDeltas;
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
