package br.com.alpha6.klout.http;

import br.com.alpha6.klout.util.StringUtils;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * @author fkurkowski
 */
public class JSONReader {

	public static InputStream asInputStream(String path) {
		String normalizedPath = normalizePath(path);
		return JSONReader.class.getResourceAsStream(normalizedPath);
	}

	public static String asString(String path) throws Exception {
		String normalizedPath = normalizePath(path);
		URL resourceURL = JSONReader.class.getResource(normalizedPath);

		return new Scanner(new File(resourceURL.toURI()), StringUtils.ENCODING_CHARSET)
				.useDelimiter("\\Z")
				.next();
	}

	private static String normalizePath(String path) {
		if (!path.startsWith("/"))
			return normalizePath("/" + path);
		else if (!path.startsWith("/json"))
			return normalizePath("/json" + path);
		else if (!path.endsWith(".json"))
			return normalizePath(path + ".json");
		else
			return path;
	}
}
