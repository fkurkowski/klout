package br.com.alpha6.klout.http;

import java.io.IOException;

/**
 * Just a simple definition of a GET only HTTP client.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public interface WebRequester {

	/**
	 * Executes a HTTP GET to a specific URL.
	 *
	 * @param url URL to send the HTTP GET
	 * @return the response
	 * @throws IOException
	 */
	public Response get(String url) throws IOException;
}
