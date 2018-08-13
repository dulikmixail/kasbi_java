package by.ramok.kasbi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)  // 404
public class EmptyDocumentException extends RuntimeException {
    public EmptyDocumentException() {
        super("Document not found");
    }
}
