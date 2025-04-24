# Projeto MongoDB com Spring Boot 🚀

[![Java 17](https://img.shields.io/badge/Java-17-blue?logo=java)](https://java.com)
[![Spring Boot 3](https://img.shields.io/badge/Spring%20Boot-3.1.5-green?logo=spring)](https://spring.io)
[![MongoDB 6](https://img.shields.io/badge/MongoDB-6.0-brightgreen?logo=mongodb)](https://mongodb.com)

Projeto demonstrativo de integração Spring Boot com MongoDB, explorando modelos documentais e padrões de persistência não-relacional.

## 📚 Objetivos
- **Comparar paradigmas**: Documentos vs Modelo Relacional
- **Implementar CRUD completo**: Operações básicas e avançadas
- **Modelar associações**:
  - ✅ Referências entre coleções (`@DBRef`)
  - ⬜ Objetos aninhados (embedded documents)
- **Otimizar consultas**: Usando `MongoRepository` e `MongoTemplate`
- **Tomar decisões de design**: Esquema flexível e modelagem hierárquica


## 📋 Endpoints - UserResource.java

| Método | Endpoint                 | Descrição                     |
|--------|--------------------------|-------------------------------|
| POST   | `/users`                 | Cria novo usuário             |
| GET    | `/users`                 | Lista todos os usuários       |
| GET    | `/users/{id}`            | Busca usuário por ID          |
| DELETE | `/users/{id}`            | Deleta usuário                |
| PUT    | `/users/{id}`            | Atualiza usuário              |
| GET    | `/users/{id}/posts`      | Busca posts do usuário        |

## 📋 Endpoints - PostResource.java

| Método | Endpoint                 | Descrição                     |
|--------|--------------------------|-------------------------------|
| POST   | `/posts`                 | Cria novo post                |
| GET    | `/posts`                 | Lista todos os posts          |
| GET    | `/posts/{id}`            | Busca post por ID             |
| DELETE | `/posts/{id}`            | Deleta post                   |
| PUT    | `/posts/{id}`            | Atualiza post                 |
| GET    | `/posts/titlesearch`     | Busca posts por título        |
| GET    | `/posts/fullsearch`      | Busca posts por texto completo|

---

Observações:

Status HTTP refletem a implementação atual do repositório
Endpoints seguem convenção REST básica
Detalhes completos disponíveis nos controllers:
- **UserResource.java
- **PostResource.java

Curso: Programação Orientada a Objetos com Java
http://educandoweb.com.br
Prof. Dr. Nelio Alves
