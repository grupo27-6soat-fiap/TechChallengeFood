package food.techchallenge.api.domain.produto.exception;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProdutoDadosEmBrancoException extends RuntimeException{
    public ProdutoDadosEmBrancoException(String message) {
        super(message);
    }

}
