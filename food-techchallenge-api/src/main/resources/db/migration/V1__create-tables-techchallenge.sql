create table cliente(
    id bigint not null auto_increment,
    cpf varchar(11) not null,
    email varchar(50) not null,
    nome varchar(50) not null,

    primary key(id)

);

create table produto(
    id bigint not null auto_increment,
    nome varchar(50) not null,
    categoria varchar(50) not null,
    descricao varchar(50) not null,
    preco float not null,
    imagem varchar(100) not null,


    primary key(id)

);


create table pedido(
    id bigint not null auto_increment,
    idCliente bigint not null,
    valorTotal float not null,
    statusPedido int not null,
    codigoFormaPagamento int not null,
    tempoDecorrido int,

    primary key(id),
    FOREIGN KEY (idCliente) REFERENCES cliente(id)

);

create table produtoPedido(
    id bigint not null auto_increment,
    idPedido bigint not null,
    idProduto bigint not null,
    quantidade int not null,
    valorProduto float not null,

    primary key(id),
    FOREIGN KEY(idProduto) REFERENCES produto(id),
    FOREIGN KEY(idPedido) REFERENCES pedido(id)
);

CREATE OR REPLACE VIEW vw_pedidos AS
SELECT ped.id as idPedido,
	   ped.statusPedido,
	   cli.nome as cliente,
	   prod.nome as produto,
	   pped.valorProduto,
	   pped.quantidade,
	   ped.valorTotal
FROM pedido ped 
JOIN produtoPedido pped ON ped.id = pped.idPedido
JOIN produto prod ON pped.idProduto = prod.id
JOIN cliente cli ON ped.idCliente = cli.id;


