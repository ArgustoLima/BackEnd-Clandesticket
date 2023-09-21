package com.example.reuso.pagamento;

import com.example.reuso.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPagamento(
        @NotNull
        Tipo tipo,
        @NotBlank
        String numero_cartao,
        Usuario usuario
) {
}
