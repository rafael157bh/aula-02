package com.ads.sistemaestudantes.model;

public class Estudante {

    private String matricula;
    private String nome;
    private String curso;
    private int semestre;
    private String situacao;

    public Estudante(String matricula, String nome, String curso, int semestre, String situacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.situacao = situacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getSituacao() {
        return situacao;
    }
}