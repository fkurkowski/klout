package br.com.alpha6.klout.model;

public class User {

	public String kloutId;
	public String nick;
	public Score score;
	public ScoreDeltas scoreDeltas;

	public String getKloutId() {
		return kloutId;
	}

	public void setKloutId(String kloutId) {
		this.kloutId = kloutId;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public ScoreDeltas getScoreDeltas() {
		return scoreDeltas;
	}

	public void setScoreDeltas(ScoreDeltas scoreDeltas) {
		this.scoreDeltas = scoreDeltas;
	}
}
