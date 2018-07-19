package by.ramok.kasbi.exceptions;

@SuppressWarnings("serial")
public class InternalServerError extends RuntimeException {
    public InternalServerError() {
    }

    public InternalServerError(String message) {
        super(message);
    }
}