package food.techchallenge.api.infrastructure.controlers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.application.produtousecases.ProdutoInteractor;
import food.techchallenge.api.domain.produto.entity.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

     private ProdutoInteractor produtoInteractor;
     private ProdutoDTOMapper produtoDTOMapper;   

     public ProdutoController(ProdutoInteractor produtoInteractor,ProdutoDTOMapper produtoDTOMapper) {
    	this.produtoInteractor = produtoInteractor;
      this.produtoDTOMapper = produtoDTOMapper;
	}
    @Operation(summary = "Cadastrar Produto")
    @ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Produto cadastrado com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Produto.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao cadastrar o produto", content = @Content), 
    @ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
    @PostMapping("/cadastrar")
    CreateProdutoResponse cadastrar(@RequestBody CreateProdutoRequest request){
      
      Produto produtoBusinessObj = produtoDTOMapper.toProduto(request);
      Produto produto = produtoInteractor.cadastrarProduto(produtoBusinessObj);
      return produtoDTOMapper.toResponse(produto);

    }

    @Operation(summary = "Listar todos os Produtos")
    @ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Produtos listados com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Produto.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao listar os produtos", content = @Content), 
    @ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
    @GetMapping("/listar")
    public @ResponseBody List<Produto> listar(){
       
        return produtoInteractor.listar();
    }
    
    @Operation(summary = "Excluir Produto")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Produto excluido com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Produto.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao excluir o produto", content = @Content), 
  	@ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
	@DeleteMapping(path ={"/excluir/{id}"})
	public void checkout(@PathVariable Long id) {

		produtoInteractor.excluir(id);
        
	}

    @Operation(summary = "Listar Produtos por categoria")
    @ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Produtos listados por categoria com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Produto.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao listar os produtos por categoria", content = @Content), 
    @ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
    @GetMapping(path ={"/listarPorCategoria/{categoria}"})
    public @ResponseBody List<Produto> listarPorCategoria(@PathVariable("categoria") String categoria){
       
        return produtoInteractor.listarPorCategoria(categoria);
    }

}
