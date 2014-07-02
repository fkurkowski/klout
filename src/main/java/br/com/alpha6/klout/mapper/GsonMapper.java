package br.com.alpha6.klout.mapper;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fkurkowski
 */
public class GsonMapper implements Mapper {

	/**
	 * Logger
	 */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private Gson gson;

	public GsonMapper() {
		this(new Gson());
	}

	public GsonMapper(Gson gson) {
		this.gson = gson;
	}

	@Override
	public <K> K map(String input, Class<K> clazz) {
		return gson.fromJson(input, clazz);
	}
}
