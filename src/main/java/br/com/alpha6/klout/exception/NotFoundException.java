package br.com.alpha6.klout.exception;

/**
 * Exception thrown when Klout does not have the requested information.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class NotFoundException extends KloutException {

	private static final long serialVersionUID = -2910302517771192898L;

	/**
	 * Creates a new {@link NotFoundException}.
	 */
	public NotFoundException() {
		super("Don't have information for your request");
	}
	
}
