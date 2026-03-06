package com.ads.sistemaestudantes.service;

import com.ads.sistemaestudantes.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {

    private final List<Curso> cursos = new ArrayList<>();

    public CursoService() {
        cursos.add(new Curso(1L, "Engenharia de Software"));
        cursos.add(new Curso(2L, "Ciência da Computação"));
        cursos.add(new Curso(3L, "Sistemas de Informação"));
        cursos.add(new Curso(4L, "Análise e Desenvolvimento de Sistemas"));
        cursos.add(new Curso(5L, "Engenharia da Computação"));
    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso buscarPorId(Long id) {
        return cursos.stream()
                .filter(curso -> curso.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}