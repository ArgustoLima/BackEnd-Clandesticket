package com.example.reuso.itens;

import com.example.reuso.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "itens")
@Entity(name = "Itens")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Itens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String valor;
    private String empresa;
    private String descricao;
    private String endereco;
    private int venda;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Itens(DadosCadastroItens dados) {
        this.nome = dados.nome();
        this.valor = dados.valor();
        this.empresa = dados.empresa();
        this.descricao = dados.descricao();
        this.endereco = dados.endereco();
        this.venda = 1;
        this.usuario = dados.usuario();
    }

    public void atualizarInformacoes(DadosAtualizacaoItens dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.valor() != null) {
            this.valor = dados.valor();
        }
        if (dados.empresa() != null) {
            this.empresa = dados.empresa();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.endereco() != null) {
            this.endereco = dados.endereco();
        }
        if (dados.venda() != 0) {
            this.venda = dados.venda();
        }
    }
}
