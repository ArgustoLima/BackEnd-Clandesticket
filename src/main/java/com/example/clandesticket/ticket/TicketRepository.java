package com.example.clandesticket.ticket;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Page<Ticket> findAllByAtivoTrue(Pageable paginacao);
}
