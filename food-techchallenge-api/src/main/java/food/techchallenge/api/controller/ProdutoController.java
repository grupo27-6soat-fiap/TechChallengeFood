package food.techchallenge.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.cliente.model.Cliente;
import food.techchallenge.api.domain.produto.interfaces.service.IProdutoService;
import food.techchallenge.api.domain.produto.model.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    IProdutoService _produtoService;

     public ProdutoController(IProdutoService produtoService) {
    	this._produtoService = produtoService;
	}
    @Operation(summary = "Cadastrar Produto")
    @ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Produto cadastrado com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao cadastrar o produto", content = @Content), 
    @ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Produto produto){
       
    	_produtoService.cadastrarProduto(produto);
    	
    }

    @GetMapping("/listar")
    public @ResponseBody List<Produto> listar(){
       
        return _produtoService.listar();
    }
    

}
