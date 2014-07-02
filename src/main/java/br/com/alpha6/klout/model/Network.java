package br.com.alpha6.klout.model;

public enum Network {

	TWITTER("tw"),

	INSTAGRAM("ig"),

	GOOGLE_PLUS("gp");

	private String code;

	private Network(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return this.code.toLowerCase();
	}

}
