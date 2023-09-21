create table itens (
    id bigint not null auto_increment,
    nome varchar(100) not null,
    valor varchar(100) not null,
    empresa varchar(100) not null,
    descricao varchar(100) not null,
    endereco varchar(100) not null,
    venda tinyint,
    usuario_id bigint,
    primary key(id),
    foreign key(usuario_id) references usuarios(id)
);