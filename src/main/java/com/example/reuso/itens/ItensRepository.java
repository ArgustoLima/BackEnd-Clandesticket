package com.example.reuso.itens;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItensRepository extends JpaRepository<Itens, Long> {
    Page<Itens> findAll(Pageable paginacao);

    Optional<Itens> findById(Long id);

}
