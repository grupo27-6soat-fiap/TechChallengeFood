package food.techchallenge.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.model.Cliente;
import food.techchallenge.api.domain.cliente.model.Produto;
import food.techchallenge.api.domain.produto.interfaces.repository.IProdutoRepository;
import food.techchallenge.api.domain.produto.interfaces.service.IProdutoService;
import food.techchallenge.api.domain.produto.vo.DadosCadastroProduto;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    IProdutoService _produtoService;

     public ProdutoController(IProdutoService produtoService) {
    	this._produtoService = produtoService;
	}
    
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Produto produto){
       
    	_produtoService.cadastrarProduto(produto);
    	
    }

    @GetMapping("/listar")
    public @ResponseBody List<Produto> listar(){
       
        return _produtoService.listar();
    }
    

}
