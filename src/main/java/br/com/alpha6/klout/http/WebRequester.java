package br.com.alpha6.klout.http;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author fkurkowski
 * @author thiagojv
 */
public interface WebRequester {
	public Response get(String url) throws IOException;
}
