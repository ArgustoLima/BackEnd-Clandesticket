create table usuarios (

    id bigint not null auto_increment,
    nome varchar(100) not null,
    sobrenome varchar(100) not null,
    cpf varchar(11) not null unique,
    email varchar(100) not null,
    senha varchar(20) not null,
    telefone varchar(20),
    endereco varchar(100) not null,
    ativo tinyint not null,

    primary key(id)

);