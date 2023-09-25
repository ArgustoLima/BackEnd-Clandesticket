package com.example.reuso.controller;

import com.example.reuso.usuario.Usuario;
import com.example.reuso.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("entrar")
public class AuthController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public Map<String, String> signIn(@RequestBody Map<String, String> request) {
        String cpf = request.get("cpf");
        String senha = request.get("senha");
        Usuario usuario = repository.findByCpfAndSenha(cpf, senha);

        if (usuario != null) {
            Map<String, Object> data = new HashMap<>();
            data.put("cpf", cpf);
            data.put("senha", senha);

            String token = generateToken(data);
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return response;
        }

        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("message", "Usuário ou senha incorreta");

        return errorResponse;
    }

    private String generateToken(Map<String, Object> data) {
        String secretKey = "YOUR_SECRET_KEY";
        long expiresIn = 100000;
        return "YOUR_JWT_TOKEN";
    }
}
