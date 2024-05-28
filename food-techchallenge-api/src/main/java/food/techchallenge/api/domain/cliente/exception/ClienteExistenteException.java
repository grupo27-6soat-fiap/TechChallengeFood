package food.techchallenge.api.domain.cliente.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ClienteExistenteException  extends RuntimeException {
    public ClienteExistenteException(String message){
        super(message);
    }

}
