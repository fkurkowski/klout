package br.com.alpha6.klout.mapper;

import br.com.alpha6.klout.mapper.serializers.InfluenceDeserializer;
import br.com.alpha6.klout.model.Influence;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a JSON {@link Mapper} implementation, used to map between
 * JSON structures and arbitrary objects. It is actually just a wrapper
 * to an underlying Gson library.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class GsonMapper implements Mapper {

	/**
	 * Logger
	 */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	private Gson gson;

	/**
	 * Creates a new {@link GsonMapper}.
	 */
	public GsonMapper() {
		this.gson = new GsonBuilder()
				.registerTypeAdapter(Influence.class, new InfluenceDeserializer())
				.create();
	}

	/**
	 * Creates a new {@link GsonMapper} using an pre-configured {@link Gson}
	 * instance.
	 *
	 * @param gson converter
	 */
	public GsonMapper(Gson gson) {
		this.gson = gson;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <K> K map(String input, Class<K> clazz) {
		return gson.fromJson(input, clazz);
	}
}
