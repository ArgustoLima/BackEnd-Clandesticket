package com.example.reuso.pagamento;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPagamento(
        @NotNull
        Long id,
        String numero_cartao
) {
}
