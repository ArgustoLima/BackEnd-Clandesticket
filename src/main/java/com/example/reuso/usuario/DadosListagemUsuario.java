package com.example.reuso.usuario;

public record DadosListagemUsuario(Long id, String nome, String cpf, String senha, String repetirsenha) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getSenha(), usuario.getRepetirsenha());
    }
}
