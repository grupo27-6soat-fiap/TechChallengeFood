package food.techchallenge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.produto.entity.Produto;
import food.techchallenge.api.domain.produto.interfaces.repository.IProdutoRepository;
import food.techchallenge.api.domain.produto.vo.DadosCadastroProduto;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    IProdutoRepository produtoRepository;

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
       
        produtoRepository.save(new Produto(dados));
    }



}
