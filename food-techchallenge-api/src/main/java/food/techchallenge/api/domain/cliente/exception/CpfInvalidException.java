package food.techchallenge.api.domain.cliente.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CpfInvalidException  extends RuntimeException {
    public CpfInvalidException(String message){
        super(message);
    }

}
