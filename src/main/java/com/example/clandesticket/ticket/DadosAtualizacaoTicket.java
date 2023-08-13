package com.example.clandesticket.ticket;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTicket(
    @NotNull
    Long id,
    String nomeevento,
    String descricao,
    String empresa,
    String endereco) {
}
