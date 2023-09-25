package com.example.reuso.usuario;

public record DadosListagemUsuario(Long id, String nome, String cpf, String senha, String repetir_senha) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getSenha(), usuario.getRepetir_senha());
    }
}
