package br.com.alpha6.klout.model;

public class Entity {

	private String id;
	private User payload;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getPayload() {
		return payload;
	}

	public void setPayload(User payload) {
		this.payload = payload;
	}

}
