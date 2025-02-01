
package io.spings.Ravi.exception;  // This should match your package structure

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);  // Pass the message to the parent RuntimeException class
    }
}
