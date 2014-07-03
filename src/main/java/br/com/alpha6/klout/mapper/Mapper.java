package br.com.alpha6.klout.mapper;

/**
 * A mapper is responsible for converting a {@link String}, usually the
 * body of an API request, into an instance of a class.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public interface Mapper {
	public <T> T map(String input, Class<T> clazz);
}
