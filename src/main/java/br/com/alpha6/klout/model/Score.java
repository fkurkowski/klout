package br.com.alpha6.klout.model;

/**
 * Representation of the influence score of an user.
 */
public class Score {

	public double score;
	public String bucket;
	public ScoreDeltas scoreDelta;

	/**
	 * Creates a new instance of this class.
	 */
	public Score() {}

	/**
	 * Creates a new instance of this class with the score information of the user
	 *
	 * @param score       the influence score.
	 * @param bucket      the score bucket.
	 * @param scoreDeltas the score changes for the past day, week and month.
	 */
	public Score(double score, String bucket, ScoreDeltas scoreDeltas) {
		this.score = score;
		this.bucket = bucket;
		this.scoreDelta = scoreDeltas;
	}

	/**
	 * Returns the influence score.
	 *
	 * @return the influence score.
	 */
	public double getScore() {
		return score;
	}

	/**
	 * Defines the influence score.
	 *
	 * @param score the influence score.
	 */
	public void setScore(double score) {
		this.score = score;
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
	 * Defines the score bucket.
	 *
	 * @param bucket the score bucket.
	 */
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	/**
	 * Returns the score changes for the past day, week and month.
	 *
	 * @return the score changes.
	 */
	public ScoreDeltas getScoreDelta() {
		return scoreDelta;
	}

	/**
	 * Defines the score changes for the past day, week and month.
	 *
	 * @param scoreDelta the score changes for the past day, week and month.
	 */
	public void setScoreDelta(ScoreDeltas scoreDelta) {
		this.scoreDelta = scoreDelta;
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