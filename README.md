# CRUD de clientes

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/henriquecesarjr/CRUD_de_clientes/blob/main/LICENSE)

# Sobre o projeto

Projeto usando Spring Boot contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas.
- Busca de cliente por id
- Busca paginada de clientes
- Inserir novo cliente
- Atualizar cliente
- Deletar cliente

## Classe Client
![Modelo Conceitual](https://github.com/henriquecesarjr/CRUD_de_clientes/blob/main/assets/Modelo%20conceitual.png)

## Mais sobre o projeto

As seguintes exceções foram tratadas:
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
- Erro de validação, retornando código 422 e mensagens customizadas para cada campo inválido.

  As regras de validação são:
  - Nome: não pode ser vazio
  - Data de nascimento: não pode ser data futura

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- H2 Database
- Maven

# Autor

Henrique César Jr. C. Marques

<a href="https://www.linkedin.com/in/henrique-marques-376a50274/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
