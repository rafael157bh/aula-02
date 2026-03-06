Atividade 1 

Atividade1Controller

Atividade 2
# Sistema de Cadastro de Estudantes

API REST simples desenvolvida com **Spring Boot** para gerenciar informações de cursos e estudantes.  
Os dados são fixos (hardcoded) — projeto criado com finalidade didática.

## Tecnologias

- Java 17
- Spring Boot
- Maven
- IntelliJ IDEA (ou outra IDE de sua preferência)

## Estrutura do Projeto

```
src/main/java/com/ads/sistemaestudantes

controller
│   SistemaController
│   CursoController
│   EstudanteController

model
│   Curso
│   Estudante

service
│   CursoService
│   EstudanteService
```

---

# Endpoints da API

## 🔹 Informações do Sistema

Base URL: `http://localhost:8080`

### Informações do sistema

GET /api/sistema/info

```
{
  "nome": "Sistema de Cadastro de Estudantes",
  "versao": "1.0",
  "dataHora": "2026-03-04T20:15:00",
  "status": "operacional"
}
```

---

# Cursos

GET /api/cursos

## Lista todos os cursos disponíveis.

GET /api/cursos/{id}

## Retorna apenas o nome do curso (ex: "Engenharia de Software").

GET /api/estudantes/{matricula}

Exemplo: /api/estudantes/2024001


Matrícula: 2024001
Nome: João Silva
Curso: Engenharia de Software
Semestre: 3

## Situação da matrícula (endpoint criativo)

GET /api/estudantes/situacao/{matricula}

Exemplo de resposta:

Matrícula: 2024001
Nome: João Silva
Situação: ATIVO

## Como executar


Clone o repositório
Abra o projeto no IntelliJ IDEA (ou sua IDE)
Execute a classe principal:
SistemaEstudantesApplication.java
A API estará disponível em:http://localhost:8080

Teste os endpoints com Postman, Insomnia ou diretamente no navegador.

# 👨‍💻 Autor

Rafael Barzaghi
Curso: Análise e Desenvolvimento de Sistemas
