package br.com.alpha6.klout.model;

/**
 * Represents the identity of an user in a social network.
 */
public class Identity {

	private String id;
	private String network;

	/**
	 * Creates a new instance of this class.
	 */
	public Identity() {
	}

	/**
	 * Creates a new instance of this class with the user information defined
	 *
	 * @param id      the id on the social network.
	 * @param network the social network of this id.
	 */
	public Identity(String id, String network) {
		this.id = id;
		this.network = network;
	}

	/**
	 * Returns the id on the social network.
	 *
	 * @return id on the social network
	 */
	public String getId() {
		return id;
	}

	/**
	 * Defines the id on the social network.
	 *
	 * @param id the id on the social network.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the social network of this id.
	 *
	 * @return social network of the id
	 */
	public String getNetwork() {
		return network;
	}

	/**
	 * Defines the social network of this id.
	 *
	 * @param network the social network of this id.
	 */
	public void setNetwork(String network) {
		this.network = network;
	}

	@Override
	public String toString() {
		return "Identity{" +
				"id='" + id + '\'' +
				", network='" + network + '\'' +
				'}';
	}
}