package com.example.reuso.pagamento;

import com.example.reuso.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPagamento(
        @NotNull
        Tipo tipo,
        @NotBlank
        @Pattern(regexp = "\\d{16}")
        String numero_cartao,
        Usuario usuario
) {
}
