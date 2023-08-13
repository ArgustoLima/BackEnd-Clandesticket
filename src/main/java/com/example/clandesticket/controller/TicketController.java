package com.example.clandesticket.controller;


import com.example.clandesticket.ticket.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tickets")
public class TicketController {

    @Autowired
    private TicketRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTicket dados) {
        repository.save(new Ticket(dados));
    }

    @GetMapping
    public Page<DadosListagemTicket> listar(@PageableDefault(size = 10, sort = {"nomeevento"})Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemTicket::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTicket dados) {
        var ticket = repository.getReferenceById(dados.id());
        ticket.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var ticket = repository.getReferenceById(id);
        ticket.excluir();
    }

}
