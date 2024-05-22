package food.techchallenge.api.domain.pedido.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Service;

import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.pedido.interfaces.repository.IPedidoRepository;
import food.techchallenge.api.domain.pedido.interfaces.repository.IProdutoPedidoRepository;
import food.techchallenge.api.domain.pedido.interfaces.service.IPedidoService;
import food.techchallenge.api.domain.pedido.model.Pedido;
import food.techchallenge.api.domain.pedido.model.ProdutoPedido;
import food.techchallenge.api.domain.pedido.model.enums.StatusPedido;
import food.techchallenge.api.domain.produto.interfaces.repository.IProdutoRepository;
import food.techchallenge.api.domain.produto.model.Produto;
import food.techchallenge.api.infraestrutura.entity.ClienteEntity;
import food.techchallenge.api.infraestrutura.entity.PedidoEntity;
import food.techchallenge.api.infraestrutura.entity.ProdutoEntity;
import food.techchallenge.api.infraestrutura.entity.ProdutoPedidoEntity;

@Service
public class PedidoService implements IPedidoService {

    private final IPedidoRepository _pedidoRepository;
    private final IProdutoRepository _produtoRepository;
    private final IClienteRepository _clienteRepository;
    private final IProdutoPedidoRepository _produtoPedidoRepository;

    public PedidoService(IPedidoRepository pedidoRepository,
            IProdutoRepository produtoRepository,
            IClienteRepository clienteRepository,
            IProdutoPedidoRepository produtoPedidoRepository) {
        _pedidoRepository = pedidoRepository;
        _produtoRepository = produtoRepository;
        _clienteRepository = clienteRepository;
        _produtoPedidoRepository = produtoPedidoRepository;
    }

    @Override
    public void cadastrarPedido(Pedido pedido) {

        PedidoEntity pedidoEntity = new PedidoEntity(pedido);
        Double valorTotal = 0.0;

        Optional<ClienteEntity> clienteRep = _clienteRepository.findById(pedido.getIdCliente());
        if (clienteRep.isPresent()) {
            pedidoEntity.setCliente(clienteRep.get());
        }

        for (ProdutoPedido produto : pedido.getProdutos()) {
            valorTotal =+ produto.getValorProduto() * produto.getQuantidade();
        }
        pedidoEntity.setValorTotal(valorTotal);

        PedidoEntity pedidoEntRet =  _pedidoRepository.save(pedidoEntity);

        for (ProdutoPedido produto : pedido.getProdutos()) {

            Optional<ProdutoEntity> produtoRep = _produtoRepository.findById(produto.getIdProduto());
            if (produtoRep.isPresent()) {
                ProdutoPedidoEntity produtoPedidoEntity = new ProdutoPedidoEntity(produto, pedidoEntRet, produtoRep);
                _produtoPedidoRepository.save(produtoPedidoEntity);
            }
        }
    }

    @Override
    public void checkoutPedido(Pedido pedido) {
        Optional<PedidoEntity> pedidoOpt = _pedidoRepository.findById(pedido.getId());
        if(pedidoOpt.isPresent()){
            PedidoEntity pedidoEntity = pedidoOpt.get();
            pedidoEntity.setStatusPedido(StatusPedido.Pronto.getCodigo());
            _pedidoRepository.save(pedidoEntity);
        }
        
    }

    

    @Override
    public List<Pedido> listarPedidos() {
        List<Pedido> teste = _pedidoRepository.listarPedidos();
        Pedido pedido = new Pedido();
        return _pedidoRepository.listarPedidos();
    
    }

    // @Override
    // public Pedido obterPedido(Pedido pedido) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method
    // 'obterPedido'");
    // }

}
