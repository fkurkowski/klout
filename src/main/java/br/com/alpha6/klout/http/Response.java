package br.com.alpha6.klout.http;

/**
 * Representation of a HTTP response.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class Response {

	/**
	 * Response status code
	 */
	private int code;

	/**
	 * Response body
	 */
	private String body;

	/**
	 * Creates a new HTTP {@link Response}.
	 *
	 * @param code status cody
	 * @param body body
	 */
	public Response(int code, String body) {
		this.code = code;
		this.body = body;
	}

	/**
	 * Returns the response status code.
	 *
	 * @return the response status code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Returns the response body.
	 *
	 * @return the response body.
	 */
	public String getBody() {
		return body;
	}
}
