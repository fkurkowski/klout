package br.com.alpha6.klout.exception;

/**
 * Exception thrown when Klout's servers are unavailable.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class UnavailableException extends KloutException {

	private static final long serialVersionUID = -4249850857052783243L;

	/**
	 * Creates a new {@link UnavailableException}.
	 */
	public UnavailableException() {
		super("Klout's servers are down.");
	}
	
}
