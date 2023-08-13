package com.example.clandesticket.ticket;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTicket(
    @NotBlank
    String nomeevento,
    @NotBlank
    String descricao,
    @NotBlank
    String empresa,
    @NotBlank
    String endereco) {
}




