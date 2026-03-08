# Projeto Web Services com Spring Boot e JPA / Hibernate
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/MarquitosBR88/projeto-springboot4-jpa/blob/main/LICENSE)

# Sobre o projeto
Esta é uma API RESTful robusta desenvolvida em Java com Spring Boot, focada em demonstrar a modelagem e a implementação de um domínio de negócios complexo. O projeto simula o back-end de um sistema de vendas, gerenciando o fluxo completo entre Usuários, Pedidos, Categorias, Produtos e Pagamentos.

O principal objetivo desta aplicação é aplicar conceitos avançados de Orientação a Objetos e boas práticas de arquitetura de software, isolando as responsabilidades em camadas bem definidas (Resource/Controllers, Services e Repositories).

A comunicação com o banco de dados é feita de forma automatizada e segura utilizando JPA e Hibernate, aplicando mapeamento objeto-relacional (ORM) de ponta a ponta. Atualmente, o sistema está configurado com um Test Profile utilizando o banco de dados em memória H2, permitindo que a aplicação seja rodada e testada instantaneamente sem a necessidade de provisionar uma infraestrutura externa.

## Modelo Conceitual
<img width="1008" height="433" alt="image" src="https://github.com/user-attachments/assets/b1585616-cc9e-48e9-a0a9-ba768a644ef2" />

# Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA & Hibernate
- H2 Database
- Maven
- Postman

# Como executar o projeto
Este projeto é uma API RESTful (Back-end). Portanto, a sua execução não renderiza telas, mas sim endpoints que retornam dados no formato JSON.

Pré-requisitos:
- Java 25
- Maven
- Postman (ou Insomnia) para testar as requisições
- Git

Passo a passo para rodar localmente:
```bash
# 1. Clonar repositório
git clone https://github.com/MarquitosBR88/projeto-springboot4-jpa.git

# 2. Entrar na pasta do projeto
cd projeto-springboot4-jpa

# 3. Executar a aplicação pelo Maven
./mvnw spring-boot:run
```

## Testando a API e o Banco de Dados:
A aplicação estará disponível na porta 8080. Com o servidor rodando, você pode acessar:
- Console do Banco H2: Acesse o navegador no endereço http://localhost:8080/h2-console. (Lembre-se de verificar no arquivo application-test.properties se a JDBC URL está configurada como jdbc:h2:mem:testdb).
- Endpoints: Abra o seu Postman e faça requisições GET para as rotas da aplicação, como por exemplo:
    - http://localhost:8080/users
    - http://localhost:8080/orders

# Autor
Marcus Vinícius Dias Marciano

www.linkedin.com/in/marcus-marciano
