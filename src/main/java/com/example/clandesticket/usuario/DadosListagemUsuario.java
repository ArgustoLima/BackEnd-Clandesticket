package com.example.clandesticket.usuario;

public record DadosListagemUsuario(Long id, String nome, String sobrenome, String email, String telefone) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getSobrenome(), usuario.getEmail(), usuario.getTelefone());
    }
}
