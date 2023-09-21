package com.example.reuso.pagamento;

public record DadosListagemPagamento(Long id, Tipo tipo, String numero_cartao, Long usuario_id, String usuario_nome, String usuario_cpf) {
    public DadosListagemPagamento(Pagamento pagamento) {
        this(
                pagamento.getId(),
                pagamento.getTipo(),
                pagamento.getNumero_cartao(),
                (pagamento.getUsuario() != null ? pagamento.getUsuario().getId() : null),
                (pagamento.getUsuario() != null ? pagamento.getUsuario().getNome() : null),
                (pagamento.getUsuario() != null ? pagamento.getUsuario().getCpf() : null));
    }
}
