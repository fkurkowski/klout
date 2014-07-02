package br.com.alpha6.klout.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static br.com.alpha6.klout.util.StringUtils.*;

/**
 * @author fkurkowski
 * @author thiagojv
 */
public class DefaultWebRequester implements WebRequester {

	/**
	 * Logger
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Executes a HTTP GET to a specific URL.
	 *
	 * @param url URL to send the HTTP GET
	 * @return the response
	 * @throws IOException
	 */
	public Response get(String url) throws IOException {

		if (logger.isDebugEnabled()) {
			logger.debug("Sending HTTP GET to {}", url);
		}

		URL u = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) u.openConnection();

		conn.setRequestProperty("Accept-Charset", ENCODING_CHARSET);
		conn.setRequestMethod("GET");

		InputStream is = null;

		try {
			is = getCorrectStream(conn);
			return new Response(conn.getResponseCode(), fromInputStream(is));
		} finally {
			close(is);
		}
	}

	/**
	 * Returns the correct stream according to the connection's response code.
	 *
	 * @param conn the connection on which the stream will be extracted
	 * @return a stream
	 * @throws IOException
	 */
	private InputStream getCorrectStream(HttpURLConnection conn) throws IOException {
		if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
			return conn.getErrorStream();
		} else {
			return conn.getInputStream();
		}
	}

	/**
	 * Closes an {@link java.io.InputStream}.
	 *
	 * @param is the inputstream
	 */
	private void close(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				if (logger.isWarnEnabled()) {
					logger.warn("Could not close stream.", e);
				}
			}
		}
	}
}
