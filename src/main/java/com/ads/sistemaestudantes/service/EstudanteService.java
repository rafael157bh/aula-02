package com.ads.sistemaestudantes.service;

import com.ads.sistemaestudantes.model.Estudante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudanteService {

    private final List<Estudante> estudantes = new ArrayList<>();

    public EstudanteService() {

        estudantes.add(new Estudante(
                "2024001",
                "João Silva",
                "Engenharia de Software",
                3,
                "ATIVO"
        ));

        estudantes.add(new Estudante(
                "2024002",
                "Maria Oliveira",
                "Ciência da Computação",
                2,
                "TRANCADO"
        ));

        estudantes.add(new Estudante(
                "2024003",
                "Carlos Souza",
                "Sistemas de Informação",
                4,
                "FORMADO"
        ));
    }

    public Estudante buscarPorMatricula(String matricula) {
        return estudantes.stream()
                .filter(e -> e.getMatricula().equals(matricula))
                .findFirst()
                .orElse(null);
    }
}