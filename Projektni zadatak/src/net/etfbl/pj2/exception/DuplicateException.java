package net.etfbl.pj2.exception;

/**
 * Exception thrown when a duplicate entry is encountered. This class provides
 * multiple constructors to handle different exception scenarios.
 * 
 * @author Pero Grubač
 * @since 2.6.2024..
 */
public class DuplicateException extends Exception {
	/**
	 * Constructs a new DuplicateException with {@code null} as its detail message.
	 */
	public DuplicateException() {
		super();
	}

	/**
	 * Constructs a new DuplicateException with the specified detail message.
	 * 
	 * @param message The detail message. The detail message is saved for later
	 *                retrieval by the {@link Throwable#getMessage()} method.
	 */
	public DuplicateException(String message) {
		super("Duplicate error: " + message);
	}

	/**
	 * Constructs a new DuplicateException with the specified cause.
	 * 
	 * @param cause The cause (which is saved for later retrieval by the
	 *              {@link Throwable#getCause()} method). (A {@code null} value is
	 *              permitted, and indicates that the cause is nonexistent or
	 *              unknown.)
	 */
	public DuplicateException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new DuplicateException with the specified detail message and
	 * cause.
	 * 
	 * @param message The detail message (which is saved for later retrieval by the
	 *                {@link Throwable#getMessage()} method).
	 * @param cause   The cause (which is saved for later retrieval by the
	 *                {@link Throwable#getCause()} method). (A {@code null} value is
	 *                permitted, and indicates that the cause is nonexistent or
	 *                unknown.)
	 */
	public DuplicateException(String message, Throwable cause) {
		super("Duplicate error: " + message, cause);
	}
}
