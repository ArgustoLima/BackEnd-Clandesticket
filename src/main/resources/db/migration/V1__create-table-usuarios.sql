create table usuarios (
    id bigint not null auto_increment,
    nome varchar(100) not null,
    cpf varchar(11) not null unique,
    senha varchar(20) not null,
    repetir_senha varchar(20) not null,
    primary key(id)
);