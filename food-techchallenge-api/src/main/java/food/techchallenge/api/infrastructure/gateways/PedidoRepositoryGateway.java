package food.techchallenge.api.infrastructure.gateways;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import food.techchallenge.api.application.gateways.PedidoGateway;
import food.techchallenge.api.domain.pedido.entity.Pedido;
import food.techchallenge.api.domain.pedido.enums.StatusPedido;
import food.techchallenge.api.domain.produtopedido.entity.ProdutoPedido;
import food.techchallenge.api.infrastructure.persistence.ClienteEntity;
import food.techchallenge.api.infrastructure.persistence.ClienteRepository;
import food.techchallenge.api.infrastructure.persistence.PedidoEntity;
import food.techchallenge.api.infrastructure.persistence.PedidoProdutoRepository;
import food.techchallenge.api.infrastructure.persistence.PedidoRepository;
import food.techchallenge.api.infrastructure.persistence.ProdutoEntity;
import food.techchallenge.api.infrastructure.persistence.ProdutoPedidoEntity;
import food.techchallenge.api.infrastructure.persistence.ProdutoRepository;

@Service
public class PedidoRepositoryGateway implements PedidoGateway {

    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;
    private final PedidoProdutoRepository produtoPedidoRepository;

    public PedidoRepositoryGateway(PedidoRepository pedidoRepository,
                                  ProdutoRepository produtoRepository,
                                  ClienteRepository clienteRepository,
                                  PedidoProdutoRepository produtoPedidoRepository) {
        
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
        this.clienteRepository = clienteRepository;
        this.produtoPedidoRepository = produtoPedidoRepository;
    
    }

    @Override
    public void cadastrarPedido(Pedido pedido) {

        PedidoEntity pedidoEntity = new PedidoEntity(pedido);

        getClienteRep(pedido, pedidoEntity);

        definirValorTotal(pedido, pedidoEntity);

        PedidoEntity pedidoEntRet =  pedidoRepository.save(pedidoEntity);

        salvarProdutosPedido(pedido, pedidoEntRet);
    }

    private void salvarProdutosPedido(Pedido pedido, PedidoEntity pedidoEntRet) {
        for (ProdutoPedido produto : pedido.getProdutos()) {

            Optional<ProdutoEntity> produtoRep = produtoRepository.findById(produto.getIdProduto());
            if (produtoRep.isPresent()) {
                ProdutoPedidoEntity produtoPedidoEntity = new ProdutoPedidoEntity(produto, pedidoEntRet, produtoRep);
                produtoPedidoRepository.save(produtoPedidoEntity);
            }
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
            Optional<ClienteEntity> clienteRep = clienteRepository.findById(pedido.getIdCliente());
            if (clienteRep.isPresent()) {
                pedidoEntity.setCliente(clienteRep.get());
            }
        }
    }

    @Override
    public void checkoutPedido(Pedido pedido) {
        Optional<PedidoEntity> pedidoOpt = pedidoRepository.findById(pedido.getId());
        if(pedidoOpt.isPresent()){
            PedidoEntity pedidoEntity = pedidoOpt.get();
            pedidoEntity.setStatusPedido(StatusPedido.Pronto.getCodigo());
            pedidoRepository.save(pedidoEntity);
        }
        
    }

    @Override
    public List<Pedido> listarPedidos() {
        List<PedidoEntity> pedidoEntities = pedidoRepository.findAll();
        return pedidoEntities.stream()
                        .map(PedidoEntity::toPedido)
                        .collect(Collectors.toList());
    }
}
