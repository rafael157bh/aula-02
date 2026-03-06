package com.ads.sistemaestudantes.controller;

import com.ads.sistemaestudantes.model.Curso;
import com.ads.sistemaestudantes.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public String buscarCursoPorId(@PathVariable Long id) {
        Curso curso = cursoService.buscarPorId(id);

        if (curso == null) {
            return "Curso não encontrado";
        }

        return curso.getNome();
    }
}