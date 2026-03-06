package com.ads.sistemaestudantes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class Atividade1Controller {

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome) {
        return "Olá, " + nome + "! Bem-vindo(a) ao Spring Boot!";
    }

    @GetMapping("/soma/{numero1}/{numero2}")
    public int soma(@PathVariable int numero1, @PathVariable int numero2) {
        return numero1 + numero2;
    }

    @GetMapping("/info")
    public Map<String, Object> info() {

        Map<String, Object> dados = new HashMap<>();

        dados.put("nomeAplicacao", "Atividade Spring Boot");
        dados.put("versaoJava", System.getProperty("java.version"));
        dados.put("dataHora", LocalDateTime.now());
        dados.put("status", "Aplicação funcionando corretamente");

        return dados;
    }

    @GetMapping("/motivacao")
    public String motivacao() {

        String[] mensagens = {
                "Continue avançando 🚀",
                "Você está evoluindo todos os dias 💪",
                "Persistência vence talento 🔥",
                "Cada linha de código te aproxima do objetivo 🎯"
        };

        Random random = new Random();
        return mensagens[random.nextInt(mensagens.length)];
    }
}