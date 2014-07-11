package br.com.alpha6.klout.model;

/**
 * Enumeration of all social networks supported by Klout.
 */
public enum Network {

	TWITTER("tw"),
	INSTAGRAM("ig"),
	GOOGLE_PLUS("gp"),
	KLOUT("ks");

	private String code;

	/**
	 * Creates a new social network.
	 *
	 * @param code social network code on Klout.
	 */
	private Network(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return this.code.toLowerCase();
	}
}