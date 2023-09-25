package com.example.reuso.pagamento;

import com.example.reuso.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pagamentos")
@Entity(name = "Pagamento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    private String numero_cartao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Pagamento(DadosCadastroPagamento dados) {
        this.tipo = dados.tipo();
        this.numero_cartao = dados.numero_cartao();
        this.usuario = dados.usuario();
    }

    public void atualizarInformacoes(DadosAtualizacaoPagamento dados) {
        if (dados.numero_cartao() != null) {
            this.numero_cartao = dados.numero_cartao();
        }
    }
}
