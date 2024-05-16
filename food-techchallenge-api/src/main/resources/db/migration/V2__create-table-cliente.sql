create table cliente(
    id bigint not null auto_increment,
    cpf varchar(11) not null,
    email varchar(50) not null,
    nome varchar(50) not null,

    primary key(id)

);

create table pedido(
    id bigint not null auto_increment,
    idCliente bigint not null,
    idProduto varchar(50) not null,
    valorTotal float not null,
    statusPedido varchar(50) not null,
    codigoFormaPagamento int not null,
    tempoDecorrido datetime not null,

    primary key(id),
    FOREIGN KEY (idCliente) REFERENCES cliente(id),
    FOREIGN KEY (idProduto) REFERENCES produto(id)

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