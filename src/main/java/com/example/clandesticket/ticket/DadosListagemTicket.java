package com.example.clandesticket.ticket;

public record DadosListagemTicket(Long id, String nomeevento, String descricao, String empresa, String endereco) {

    public DadosListagemTicket(Ticket ticket) {
        this(ticket.getId(), ticket.getNomeevento(), ticket.getDescricao(), ticket.getEmpresa(), ticket.getEndereco());
    }
}
