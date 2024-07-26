package food.techchallenge.api.apiexception;
// package food.techchallenge.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import food.techchallenge.api.domain.cliente.exception.ClienteExistenteException;
import food.techchallenge.api.domain.cliente.exception.ClienteNomeEmBrancoException;
import food.techchallenge.api.domain.cliente.exception.ClienteNotFoundException;
import food.techchallenge.api.domain.cliente.exception.CpfInvalidException;
import food.techchallenge.api.domain.produto.exception.ProdutoDadosEmBrancoException;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(ClienteNotFoundException.class)
    public ResponseEntity<Object> handleClienteNotFoundException(ClienteNotFoundException ex, WebRequest request) {
        String mensagem = ex.getMessage();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
    }

    @ExceptionHandler(CpfInvalidException.class)
    public ResponseEntity<Object> handleCpfInvalidException(CpfInvalidException ex, WebRequest request) {
        String mensagem = ex.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagem);
    }

    @ExceptionHandler(ClienteExistenteException.class)
    public ResponseEntity<Object> handleClienteExistenteException(ClienteExistenteException ex, WebRequest request) {
        String mensagem = ex.getMessage();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(mensagem);
    }
    @ExceptionHandler(ClienteNomeEmBrancoException.class)
    public ResponseEntity<Object> handleClienteNomeEmBrancoException(ClienteNomeEmBrancoException ex, WebRequest request) {
        String mensagem = ex.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagem);
    }
    
    @ExceptionHandler(ProdutoDadosEmBrancoException.class)
    public ResponseEntity<Object> handleProdutoDadosEmBrancoException(ProdutoDadosEmBrancoException ex, WebRequest request) {
        String mensagem = ex.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensagem);
    }
    

}
