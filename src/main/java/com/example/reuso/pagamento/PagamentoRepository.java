package com.example.reuso.pagamento;

import com.example.reuso.itens.Itens;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    Page<Pagamento> findAll(Pageable paginacao);
    Optional<Pagamento> findById(Long id);
}
