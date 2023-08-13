create table tickets (

    id bigint not null auto_increment,
    nomeEvento varchar(100) not null,
    descricao varchar(100) not null,
    empresa varchar(100) not null,
    endereco varchar(100) not null,
    ativo tinyint not null,

    primary key(id)

);
