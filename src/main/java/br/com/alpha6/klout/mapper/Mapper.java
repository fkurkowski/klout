package br.com.alpha6.klout.mapper;

/**
 * @author fkurkowski
 */
public interface Mapper {
	public <T> T map(String input, Class<T> clazz);
}
