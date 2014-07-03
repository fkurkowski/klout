package br.com.alpha6.klout.model;

/**
 * Represents the identity of an user in a social network.
 */
public class Identity {

	/**
	 * ID on the social network.
	 */
	private String id;

	/**
	 * Social network.
	 */
	private String network;

	/**
	 * Returns the id on the social network.
	 *
	 * @return id on the social network
	 */
	public String getId() {
		return id;
	}

	/**
	 * Returns the social network of this id.
	 *
	 * @return social network of the id
	 */
	public String getNetwork() {
		return network;
	}

	@Override
	public String toString() {
		return "Identity{" +
				"id='" + id + '\'' +
				", network='" + network + '\'' +
				'}';
	}
}