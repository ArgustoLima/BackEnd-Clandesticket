package com.example.reuso.itens;

import com.example.reuso.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroItens(
        @NotBlank
        String nome,
        @NotBlank
        String valor,
        @NotBlank
        String empresa,
        @NotBlank
        String descricao,
        @NotBlank
        String endereco,
        int venda,
        Usuario usuario
    ) {
}
