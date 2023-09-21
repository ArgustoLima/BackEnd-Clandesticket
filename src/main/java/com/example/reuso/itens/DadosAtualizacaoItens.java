package com.example.reuso.itens;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoItens(
        @NotNull
        Long id,
        String nome,
        String valor,
        String empresa,
        String descricao,
        String endereco,
        int venda
) {
}
