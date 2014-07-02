package br.com.alpha6.klout.model;

public class Score {

	public double score;
	public String bucket;
	public ScoreDeltas scoreDelta;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public ScoreDeltas getScoreDelta() {
		return scoreDelta;
	}

	public void setScoreDelta(ScoreDeltas scoreDelta) {
		this.scoreDelta = scoreDelta;
	}

}
