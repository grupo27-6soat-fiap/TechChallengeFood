package food.techchallenge.api.domain.pedido.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import food.techchallenge.api.domain.pedido.interfaces.repository.IPedidoRepository;
import food.techchallenge.api.domain.pedido.interfaces.repository.IProdutoPedidoRepository;
import food.techchallenge.api.domain.pedido.interfaces.service.IPedidoService;
import food.techchallenge.api.domain.pedido.model.Pedido;
import food.techchallenge.api.domain.pedido.model.ProdutoPedido;
import food.techchallenge.api.domain.pedido.model.enums.StatusPedido;
import food.techchallenge.api.infraestrutura.entity.PedidoEntity;
import food.techchallenge.api.infrastructure.persistence.ClienteEntity;
import food.techchallenge.api.infrastructure.persistence.ClienteRepository;

@Service
public class PedidoService implements IPedidoService {

    private final IPedidoRepository _pedidoRepository;
    //private final IProdutoRepository _produtoRepository;
    private final ClienteRepository _clienteRepository;
    private final IProdutoPedidoRepository _produtoPedidoRepository;

    public PedidoService(IPedidoRepository pedidoRepository,
           // IProdutoRepository produtoRepository,
            ClienteRepository clienteRepository,
            IProdutoPedidoRepository produtoPedidoRepository) {
        _pedidoRepository = pedidoRepository;
       // _produtoRepository = produtoRepository;
        _clienteRepository = clienteRepository;
        _produtoPedidoRepository = produtoPedidoRepository;
    }

    @Override
    public void cadastrarPedido(Pedido pedido) {

        PedidoEntity pedidoEntity = new PedidoEntity(pedido);

        getClienteRep(pedido, pedidoEntity);

        definirValorTotal(pedido, pedidoEntity);

        PedidoEntity pedidoEntRet =  _pedidoRepository.save(pedidoEntity);

        salvarProdutosPedido(pedido, pedidoEntRet);
    }

    private void salvarProdutosPedido(Pedido pedido, PedidoEntity pedidoEntRet) {
        for (ProdutoPedido produto : pedido.getProdutos()) {

            // Optional<ProdutoEntity> produtoRep = _produtoRepository.findById(produto.getIdProduto());
            // if (produtoRep.isPresent()) {
            //     ProdutoPedidoEntity produtoPedidoEntity = new ProdutoPedidoEntity(produto, pedidoEntRet, produtoRep);
            //     _produtoPedidoRepository.save(produtoPedidoEntity);
            // }
        }
    }

    private void definirValorTotal(Pedido pedido, PedidoEntity pedidoEntity) {
        Double valorTotal = 0.0;
        for (ProdutoPedido produto : pedido.getProdutos()) {
            valorTotal =+ produto.getValorProduto() * produto.getQuantidade();
        }
        pedidoEntity.setValorTotal(valorTotal);
    }

    private void getClienteRep(Pedido pedido, PedidoEntity pedidoEntity) {
        if(pedido.getIdCliente() != null){
            Optional<ClienteEntity> clienteRep = _clienteRepository.findById(pedido.getIdCliente());
            if (clienteRep.isPresent()) {
                pedidoEntity.setCliente(clienteRep.get());
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
        List<PedidoEntity> pedidoEntities = _pedidoRepository.findAll();
        return pedidoEntities.stream()
                        .map(PedidoEntity::toPedido)
                        .collect(Collectors.toList());
    }
}
