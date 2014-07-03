package br.com.alpha6.klout.model;

/**
 * Representation of the influence score of an user.
 */
public class Score {

	public double score;
	public String bucket;
	public ScoreDeltas scoreDelta;

	/**
	 * Returns the influence score.
	 *
	 * @return the influence score.
	 */
	public double getScore() {
		return score;
	}

	/**
	 * Returns the score bucket.
	 *
	 * @return the score bucket.
	 */
	public String getBucket() {
		return bucket;
	}

	/**
	 * Returns the score changes for the past day, week and month.
	 *
	 * @return the score changes.
	 */
	public ScoreDeltas getScoreDelta() {
		return scoreDelta;
	}

	@Override
	public String toString() {
		return "Score{" +
				"score=" + score +
				", bucket='" + bucket + '\'' +
				", scoreDelta=" + scoreDelta +
				'}';
	}
}
