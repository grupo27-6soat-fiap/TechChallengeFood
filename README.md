# TechChallengeFood
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/grupo27-6soat-fiap/TechChallengeFood/blob/ac0b311cf474702ef975e8d188af4a854badcd0f/LICENSE)

# Sobre o projeto

TechChallengeFood é um projeto que desenvolve uma aplicação para um restaurante fast food, com ênfase na parte backend. Utilizamos Docker e aplicamos os conceitos de arquitetura hexagonal. Dentro dessa aplicação, documentamos as APIs usando o Swagger. Vale destacar que os requisitos fornecidos aos alunos não incluíam a parte de frontend.

O objetivo deste projeto é implementar um sistema que atenda às necessidades dos clientes, incluindo funcionários, proprietários e usuários do restaurante. O sistema visa proporcionar autonomia, escalabilidade, resiliência e praticidade em todos os aspectos de sua implementação.

Para desenvolver este software, utilizamos a metodologia DDD (Domain-Driven Design). Aplicando esses conceitos, conseguimos nos aprofundar nos requisitos e proporcionar uma experiência agradável e eficiente aos nossos clientes.
## Swagger
![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/555e0c0a-8764-4cc8-b62f-9ff404b92ea3)

## Domain-driven design
![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/06481679-ca3c-4b1d-a574-80e3fc1adcbc)

# Collection API Postman
[![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/7c176de0-6cf8-4d62-9b7d-53cccf43caca)
](https://github.com/grupo27-6soat-fiap/TechChallengeFood/blob/7db2018ad0638a380aa5bbc533998362560f924b/CollectionAPIPostman.json)

# Miro
[![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/ac2545b8-8be5-4b5d-8887-aefd81242c4e)
](https://miro.com/app/board/uXjVKStNlQI=/?share_link_id=418037355467)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Base de dados
- MySql

## Implementação
Para implantar o projeto, utilizamos o conceito de containers com o Docker como ferramenta de gerenciamento. Nosso projeto usa tanto Dockerfile quanto Docker-compose. Utilizamos uma imagem do Java com Spring e uma imagem do MySQL para rodar o banco de dados localmente e realizar as operações de CRUD da nossa aplicação.

# Como executar o projeto

## Back end
Pré-requisitos: Java 17, JDK 17, Maven, MySql Server.

# Como rodar local:

```bash
# clonar repositório
git clone [https://github.com/grupo27-6soat-fiap/TechChallengeFood.git]

# entrar na pasta do projeto food-techchallenge-api
cd food-techchallenge-api

# executar o projeto
./mvnw spring-boot:run
```
# Como rodar usando Docker:
```bash
# clonar repositório
git clone [https://github.com/grupo27-6soat-fiap/TechChallengeFood.git]

# entrar na pasta do projeto food-techchallenge-api
cd food-techchallenge-api

# entrar no terminal e executar o seguinte comando
docker compose up --build
```

## Autores

- Henrique Rodriues da Silva RM 353376
- Felipe Reis - RM 353932
- Lucas Marques - RM 353910
- Lucas Domingues - RM 353900

## Linkedin

- https://www.linkedin.com/in/felipe-reis-028a38181/
- https://www.linkedin.com/in/henrique-rodrigues-639873173/


