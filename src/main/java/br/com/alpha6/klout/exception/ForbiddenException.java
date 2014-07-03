package br.com.alpha6.klout.exception;

/**
 * Exception thrown when the user's key is invalid or has surpassed API
 * limits.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class ForbiddenException extends KloutException {

	private static final long serialVersionUID = 4520030849956624899L;

	/**
	 * Creates a new {@link ForbiddenException}.
	 */
	public ForbiddenException() {
		super("No key, invalid key, over quota or limit");
	}
	
}
