# TechChallengeFood
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/grupo27-6soat-fiap/TechChallengeFood/blob/ac0b311cf474702ef975e8d188af4a854badcd0f/LICENSE)

## GRUPO 27 - 6SOAT 

## Autores

- Henrique Rodrigues da Silva RM 353376
- Felipe Reis - RM 353932
- Lucas Marques - RM 353910
- Lucas Domingues - RM 353900

## Linkedin

- https://www.linkedin.com/in/felipe-reis-028a38181/
- https://www.linkedin.com/in/henrique-rodrigues-639873173/
- https://www.linkedin.com/in/lucas-domingues-de-souza-565720a1/
- https://www.linkedin.com/in/lucas-marques-a4848a52/


# Tecnologias utilizadas
## Back end
- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
- ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
- ![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
-	![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
-	![Kubernetes](https://img.shields.io/badge/kubernetes-%23326ce5.svg?style=for-the-badge&logo=kubernetes&logoColor=white)


## Base de dados
- ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
  
# Sobre o projeto

TechChallengeFood é um projeto que desenvolve uma aplicação para um restaurante fast food, com ênfase na parte backend. Utilizamos Docker e aplicamos os conceitos de arquitetura hexagonal. Dentro dessa aplicação, documentamos as APIs usando o Swagger. Vale destacar que os requisitos fornecidos aos alunos não incluíam a parte de frontend.

O objetivo deste projeto é implementar um sistema que atenda às necessidades dos clientes, incluindo funcionários, proprietários e usuários do restaurante. O sistema visa proporcionar autonomia, escalabilidade, resiliência e praticidade em todos os aspectos de sua implementação.

Para desenvolver este software, utilizamos a metodologia DDD (Domain-Driven Design). Aplicando esses conceitos, conseguimos nos aprofundar nos requisitos e proporcionar uma experiência agradável e eficiente aos nossos clientes.
## Swagger
![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/555e0c0a-8764-4cc8-b62f-9ff404b92ea3)

## Domain-driven design
![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/06481679-ca3c-4b1d-a574-80e3fc1adcbc)

# Link Swagger:
[![image](https://github.com/user-attachments/assets/dc69b964-62eb-4a09-987f-20741a462d76)](http://localhost:30002/swagger-ui/index.html)

# Para acessar a Collection da API Postman clique na imagem:
[![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/7c176de0-6cf8-4d62-9b7d-53cccf43caca)
](https://github.com/grupo27-6soat-fiap/TechChallengeFood/blob/7db2018ad0638a380aa5bbc533998362560f924b/CollectionAPIPostman.json)

# Para acessar o Miro clique na imagem:
[![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/assets/167378602/ac2545b8-8be5-4b5d-8887-aefd81242c4e)
](https://miro.com/app/board/uXjVKStNlQI=/?share_link_id=418037355467)

# Arquiterua Infraestrutura Kubernetes:
Visando atender os requisitos do nosso projeto utilizamos a arquitetura Kubernetes em conjunto com o Docker como provedor de infraestrutura, aproveitando ao máximo os recursos nativos oferecidos pela plataforma. Dentro do cluster Kubernetes, estabelecemos o namespace "food-techchallenge-api" para agrupar todos os recursos diretamente relacionados à nossa aplicação. Além disso, reservamos o namespace "db_techfood" para nosso banco de dados gerenciado internamente pelo Kubernetes. Dentro do namespace "food-techchallenge-api", adotamos uma abordagem de segmentação dos componentes com base em suas responsabilidades específicas, o que facilita a visualização e compreensão da nossa estrutura arquitetônica. Essa prática visa proporcionar uma organização clara e intuitiva dos elementos que compõem a aplicação. Na imagem abaixo ilustramos como está sendo arquitetado o processo e também a comunicação entre eles, onde estamos expondo para a internet na porta 30002 nossa aplicação Java com Springboot e intermante na temos a aplicação MySql sendo executada em um outro pode, para persistir os dados criamos um volume para o banco e toda essa comunicação da aplicação com a base de dados está sendo feita através das services, para provisionar uma escalabilidade ao nosso projeto estamos utilizando o HPA que é responsável por verificar as métricas dos pod's e criar replicas para atender a necessidade de requisições.
![image](https://github.com/grupo27-6soat-fiap/TechChallengeFood/blob/9ad3c14929a53c745bbb648bb42a8d6aeaff7607/Arquitetura.drawio.png)



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
# Como rodar usando Docker Desktop:

## Instalar o Docker Desktop:
### Link para download:
[![image](https://github.com/user-attachments/assets/a6a28d2e-eb6a-41b7-85b5-e6a3ca5d55a8)](https://www.docker.com/products/docker-desktop/)


```bash
# clonar repositório
git clone [https://github.com/grupo27-6soat-fiap/TechChallengeFood.git]

# entrar na pasta do projeto food-techchallenge-api
cd food-techchallenge-api

# entrar no terminal e executar o seguinte comando
docker compose up --build
```



# Como rodar usando Kubernetes:

### Ativar no Docker Desktop a opção do Kubernetes:

### Clicar em Settings (Configuração)
![image](https://github.com/user-attachments/assets/52692e2e-3937-49dc-a7b9-c25cfd2e8dbc)

### Selecionar opção a esquerda do menu chamada "Kubernetes", clicar em "Enable Kubernetes" e depois em "Apply & Start:
![image](https://github.com/user-attachments/assets/fdddf1be-fbd3-476e-8eba-0dc235ac309c)
### Após o Kubernetes incializar, seguir os próximos passos:

### Clonar repositório:
git clone [https://github.com/grupo27-6soat-fiap/TechChallengeFood.git]

### Entrar na pasta do projeto food-techchallenge-api:
cd food-techchallenge-api
### Abrir o PowerShell ou o terminal do computador
### Ordem de execução dos arquivos Yaml:
1 - Executar os arquivos da pasta food-techchallenge-api/k8s/db:
 - 1.1 - kubectl apply -f ./k8s/db/pvc-db.yaml
 - 1.2 - kubectl apply -f ./k8s/db/configmap-db.yaml
 - 1.3 - kubectl apply -f ./k8s/db/service-db.yaml
 - 1.4 - kubectl apply -f ./k8s/db/deployment-db.yaml

   
2 - Executar os arquivos da pasta food-techchallenge-api/k8s/backend:
 - 2.1 - kubectl apply -f ./k8s/backend/configmap-api.yaml
 - 2.2 - kubectl apply -f ./k8s/backend/service-api.yaml
 - 2.3 - kubectl apply -f ./k8s/backend/deployment-api.yaml
 - 2.4 - kubectl apply -f ./k8s/backend/components.yaml
 - 2.5 - kubectl apply -f ./k8s/backend/api-hpa.yaml
   
## Linguagem Ubíqua
 ```bash
# Menu:

- Combos: Uma refeição que está agrupada incluindo bebidas, acompanhamentos e o lanche.
- Bebidas: Refrigerantes, sucos, água com e sem gás, chá e etc.
- Lanche: Opções de sanduíches como: x-banco, x-salada, hamburguer.
- Sobremsa: Opções de comida doces como por exemplo: sorvete, brigadeiro, bolo e etc.
- Acompanhamento: Batata frita, Dadinho de tapioca, Onion rings, nuggets.

# Pedido:

- Balcão: Local onde o cliente pode retirar o pedido.
- Cliente: Responsável por realizar o pedido e retirar a comida com o atendente.
- Ticket: Número do pedido gerado após pagamento.

# Cozinha:

- Montagem do pedido: Momento em que o pedido do cliente começa ser montado pelos cozinheiros, para ser entregue ao cliente.
- Cozinheiros: Responsáveis por cozinhar e realizar a montagem do pedido.
- Controle de pedido: Onde os cozinheiros validam quais são os pedidos pendenes e finalizados.
- Gestão de qualidade: Processo onde é validado a qualidade de cada ingrediente antes de inicializar o dia do restaurante.
- Ingredientes: Tudo aquilo que compõem o pedido a ser montado e entregue para o cliente.

# Pagamento:

- Checkout: Onde o pagamento é realizado e validado para finalizar o pedido.
- Gestão de pagamento: Onde é realizado a validação e controle das formas de pagamentos aceitas para o restaurante.
- Cupom fiscal: Documento que é gerado caso o cliente deseje ter o  documento após realizar o pagamento.
- Formas de pagamento: Dinheiro, pix, cartão de crédito, cartã de débito.
```
