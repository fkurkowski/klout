package br.com.alpha6.klout.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Copyright (c) 2010-2014 Mark Allen.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
public class StringUtils {

	public static final String ENCODING_CHARSET = "UTF-8";

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory.getLogger(StringUtils.class);

	/**
	 * Builds and returns a string representation of the given {@code inputStream} .
	 *
	 * @param inputStream The stream from which a string representation is built.
	 * @return A string representation of the given {@code inputStream}.
	 * @throws IOException If an error occurs while processing the {@code inputStream}.
	 */
	public static String fromInputStream(InputStream inputStream) throws IOException {
		if (inputStream == null)
			return null;

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(inputStream, ENCODING_CHARSET));
			StringBuilder response = new StringBuilder();

			String line = null;
			while ((line = reader.readLine()) != null)
				response.append(line);

			return response.toString();
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (Throwable t) {
					// Really nothing we can do but log the error
					if (logger.isWarnEnabled())
						logger.warn("Unable to close stream, continuing on: " + t);
				}
		}
	}
}
