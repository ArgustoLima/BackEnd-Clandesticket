package com.example.reuso.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Page<Usuario> findAll(Pageable paginacao);

    Usuario findByCpfAndSenha(String cpf, String senha);

    Optional<Usuario> findById(Long id);
}
