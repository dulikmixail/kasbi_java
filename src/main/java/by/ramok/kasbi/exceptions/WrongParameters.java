package by.ramok.kasbi.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongParameters extends RuntimeException {

    public WrongParameters() {
    }

    public WrongParameters(String message) {
        super(message);
    }

}