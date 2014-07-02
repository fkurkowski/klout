package br.com.alpha6.klout.http;

/**
 * @author fkurkowski
 */
public class Response {
	private int code;
	private String body;

	public Response(int code, String body) {
		this.code = code;
		this.body = body;
	}

	public int getCode() {
		return code;
	}

	public String getBody() {
		return body;
	}
}
