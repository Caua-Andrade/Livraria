# 📚 Livraria API

API REST desenvolvida com **Spring Boot** para gerenciamento de **Autores** e **Livros**, utilizando **JPA/Hibernate** e banco de dados **H2 em memória**.

O projeto aplica uma **arquitetura em camadas**, tratamento global de exceções e relacionamento entre entidades.

---

## 🚀 Tecnologias Utilizadas

* **Java**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **H2 Database**
* **Lombok**
* **Maven**

---

## 🧱 Arquitetura do Projeto

O projeto está organizado em camadas, separando responsabilidades e facilitando manutenção e evolução.

```text
com.caua.livraria
├── config
│   └── TestConfig.java
├── controller
│   ├── AutorController.java
│   ├── LivroController.java
│   └── exception
│       ├── ControllerExceptionHandler.java
│       └── ErrorResponse.java
├── entity
│   ├── Autor.java
│   └── Livro.java
├── repository
│   ├── AutorRepository.java
│   └── LivroRepository.java
├── service
│   ├── AutorService.java
│   ├── LivroService.java
│   └── exception
│       └── EntityNotFound.java
└── LivrariaApplication.java

```

---

## 📂 Camadas do Sistema

### Controller

Responsável por receber as requisições HTTP e retornar as respostas da API.

### Service

Contém a lógica de negócio da aplicação, validações e regras de atualização.

### Repository

Responsável pela comunicação com o banco de dados utilizando Spring Data JPA.

### Entity

Define as entidades do sistema e seus relacionamentos:

* **Autor**: Um autor pode possuir vários livros (`@OneToMany`).
* **Livro**: Um livro pertence a um autor (`@ManyToOne`).

Para evitar loop infinito no JSON, utilizamos `@JsonManagedReference` e `@JsonBackReference`.

---

## ⚠️ Exception Handling

Tratamento centralizado de erros da aplicação.

**Exemplo de resposta de erro:**

```json
{
  "timestamp": "2026-02-03T01:00:00Z",
  "status": 404,
  "error": "Not Found",
  "message": "Livro de ID: 5 não encontrado!",
  "path": "/livros/5"
}

```

---

## 📡 Endpoints da API

### 👤 Autor

| Método | Endpoint | Descrição |
| --- | --- | --- |
| POST | `/autor` | Criar autor |
| GET | `/autor` | Listar todos os autores |
| GET | `/autor/{id}` | Buscar autor por ID |
| PUT | `/autor/{id}` | Atualizar autor |
| DELETE | `/autor/{id}` | Deletar autor |

### 📘 Livro

| Método | Endpoint | Descrição |
| --- | --- | --- |
| POST | `/livros` | Criar livro |
| GET | `/livros` | Listar todos os livros |
| GET | `/livros/{id}` | Buscar livro por ID |
| PUT | `/livros/{id}` | Atualizar livro |
| DELETE | `/livros/{id}` | Deletar livro |

---

## 🧪 Dados Iniciais e Banco de Dados

A classe `TestConfig` insere automaticamente dados no banco ao iniciar a aplicação:

* **Autores:** Carlos, Cauã.
* **Livros:** Senhor dos Anéis, Clean Code.

**Console H2:** `http://localhost:8080/h2-console`

**JDBC URL:** `jdbc:h2:mem:testdb`

---

## ▶️ Como Executar o Projeto

```bash
git clone https://github.com/seu-usuario/livraria-api.git
cd livraria-api
./mvnw spring-boot:run

```

---

## 🎯 Objetivo do Projeto

Projeto com foco educacional para praticar:

* CRUD com Spring Boot
* Relacionamentos JPA
* Arquitetura em camadas
* API REST e Tratamento global de exceções

**Desenvolvido por Cauã 🚀**
