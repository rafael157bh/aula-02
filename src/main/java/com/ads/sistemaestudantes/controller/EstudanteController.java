package com.ads.sistemaestudantes.controller;

import com.ads.sistemaestudantes.model.Estudante;
import com.ads.sistemaestudantes.service.EstudanteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {

    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping("/{matricula}")
    public String buscarEstudante(@PathVariable String matricula) {

        Estudante estudante = estudanteService.buscarPorMatricula(matricula);

        if (estudante == null) {
            return "Estudante não encontrado";
        }

        return """
                Matrícula: %s
                Nome: %s
                Curso: %s
                Semestre: %d
                """.formatted(
                estudante.getMatricula(),
                estudante.getNome(),
                estudante.getCurso(),
                estudante.getSemestre()
        );
    }

    @GetMapping("/situacao/{matricula}")
    public String verificarSituacao(@PathVariable String matricula) {

        Estudante estudante = estudanteService.buscarPorMatricula(matricula);

        if (estudante == null) {
            return "Estudante não encontrado";
        }

        return """
            Matrícula: %s
            Nome: %s
            Situação: %s
            """.formatted(
                estudante.getMatricula(),
                estudante.getNome(),
                estudante.getSituacao()
        );
    }
}