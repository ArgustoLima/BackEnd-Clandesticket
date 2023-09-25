package com.example.reuso.controller;

import com.example.reuso.pagamento.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPagamento dados) {
        repository.save(new Pagamento(dados));
    }

    @GetMapping
    public Page<DadosListagemPagamento> listar(@PageableDefault(sort = {"id"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPagamento::new);
    }

    @GetMapping("/{id}")
    public Optional<Pagamento> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPagamento dados) {
        var itens =  repository.getReferenceById(dados.id());
        itens.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
