package br.com.alpha6.klout.exception;

/**
 * Base class for every Klout exception.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class KloutException extends Exception {

	private static final long serialVersionUID = 6121616908108502030L;

	/**
	 * Creates a {@link KloutException} from a {@link Throwable}.
	 *
	 * @param cause the exception cause
	 */
	public KloutException(Throwable cause) {
		super(cause);
	}

	/**
	 * Creates a {@link KloutException} with a reason.
	 *
	 * @param reason the exception reason
	 */
	public KloutException(String reason) {
		super(reason);
	}
	
}
