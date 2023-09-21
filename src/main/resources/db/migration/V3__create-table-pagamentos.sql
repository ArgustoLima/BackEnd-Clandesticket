create table pagamentos (
    id bigint not null auto_increment,
    tipo varchar(100) not null,
    numero_cartao varchar(100) not null unique,
    usuario_id bigint,
    primary key(id),
    foreign key(usuario_id) references usuarios(id)
);