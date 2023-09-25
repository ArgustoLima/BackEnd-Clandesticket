package com.example.reuso.usuario;

import com.example.reuso.itens.Itens;
import com.example.reuso.pagamento.Pagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String senha;
    private String repetir_senha;

    @OneToMany(mappedBy = "usuario")
    private List<Itens> itens;

    @OneToMany(mappedBy = "usuario")
    private List<Pagamento> pagamentos;

    public Usuario(DadosCadastroUsuario dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.senha = dados.senha();
        this.repetir_senha = dados.repetir_senha();
    }

    public void atualizarInformacoes(DadosAtualizacaoUsuario dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.cpf() != null) {
            this.cpf = dados.cpf();
        }
        if (dados.senha() != null) {
            this.senha = dados.senha();
        }
        if (dados.repetir_senha() != null) {
            this.repetir_senha = dados.repetir_senha();
        }
    }
}
