package com.example.reuso.itens;

import com.example.reuso.usuario.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<Itens, Long> {
    Page<Itens> findAll(Pageable paginacao);
}
