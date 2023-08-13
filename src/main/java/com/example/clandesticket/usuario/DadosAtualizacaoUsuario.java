package com.example.clandesticket.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Long id,
        String nome,
        String sobrenome,
        String cpf,
        String email,
        String senha,
        String telefone,
        String endereco) {

}
