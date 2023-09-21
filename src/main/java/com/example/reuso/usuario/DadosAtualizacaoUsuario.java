package com.example.reuso.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Long id,
        String nome,
        String cpf,
        String senha,
        String repetirsenha) {

}
