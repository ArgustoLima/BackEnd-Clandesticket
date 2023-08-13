package com.example.clandesticket.ticket;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tickets")
@Entity(name = "Ticket")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeevento;
    private String descricao;
    private String empresa;
    private String endereco;
    private Boolean ativo;

    public Ticket(DadosCadastroTicket dados) {
        this.ativo = true;
        this.nomeevento = dados.nomeevento();
        this.descricao = dados.descricao();
        this.empresa = dados.empresa();
        this.endereco = dados.endereco();
    }

    public void atualizarInformacoes(DadosAtualizacaoTicket dados) {
        if (dados.nomeevento() != null) {
            this.nomeevento = dados.nomeevento();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.empresa() != null) {
            this.empresa = dados.empresa();
        }
        if (dados.endereco() != null) {
            this.endereco = dados.endereco();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
