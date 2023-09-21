package com.example.reuso;

import com.example.reuso.itens.Itens;
import com.example.reuso.itens.ItensRepository;
import com.example.reuso.usuario.DadosCadastroUsuario;
import com.example.reuso.usuario.Usuario;
import com.example.reuso.usuario.UsuarioRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReusoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReusoApplication.class, args);
	}

}
