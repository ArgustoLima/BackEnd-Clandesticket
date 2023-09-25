package com.example.reuso.controller;

import com.example.reuso.itens.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping("itens")
public class ItensController {

    @Autowired
    private ItensRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroItens dados) {
        repository.save(new Itens(dados));
    }

    @GetMapping
    public List<DadosListagemItens> listar() {
        return repository.findAll().stream().map(DadosListagemItens::new).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Optional<Itens> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@PathVariable Long id, @RequestBody @Valid DadosAtualizacaoItens dados) {
        var itens = repository.getReferenceById(id);
        itens.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
