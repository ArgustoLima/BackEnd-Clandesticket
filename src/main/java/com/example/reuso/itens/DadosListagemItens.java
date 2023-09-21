package com.example.reuso.itens;

import com.example.reuso.usuario.Usuario;

public record DadosListagemItens(
        Long id,
        String nome,
        String valor,
        String empresa,
        String descricao,
        String endereco,
        int venda,
        Long usuario_id,
        String usuario_nome,
        String usuario_cpf
) {
    public DadosListagemItens(Itens itens) {
        this(
                itens.getId(),
                itens.getNome(),
                itens.getValor(),
                itens.getEmpresa(),
                itens.getDescricao(),
                itens.getEndereco(),
                itens.getVenda(),
                (itens.getUsuario() != null ? itens.getUsuario().getId() : null),
                (itens.getUsuario() != null ? itens.getUsuario().getNome() : null),
                (itens.getUsuario() != null ? itens.getUsuario().getCpf() : null)
        );
    }
}

