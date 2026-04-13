

# 📦 Microsserviço de Pedidos

<div align="center">

![Java](https://img.shields.io/badge/Java-17-000?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-000?style=for-the-badge&logo=springboot)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-000?style=for-the-badge&logo=rabbitmq)
![Docker](https://img.shields.io/badge/Docker-000?style=for-the-badge&logo=docker)
![Maven](https://img.shields.io/badge/Maven-000?style=for-the-badge&logo=apachemaven)
![MySQL](https://img.shields.io/badge/MySQL-000?style=for-the-badge&logo=mysql)

</div>

<div align="center">

![GitHub repo size](https://img.shields.io/github/repo-size/cauacouto/microservice-pedidos?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/cauacouto/microservice-pedidos?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/cauacouto/microservice-pedidos?style=for-the-badge)

</div>

Este projeto é um microsserviço responsável pelo gerenciamento de pedidos dentro de uma arquitetura de microsserviços.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- RabbitMQ
- Maven
- Docker

---

## 🧠 Arquitetura

O sistema segue o padrão de **arquitetura de microsserviços**, onde cada serviço possui responsabilidade isolada, facilitando escalabilidade e manutenção :contentReference[oaicite:0]{index=0}.

### 📌 Responsabilidades do serviço de pedidos:

- Criar pedidos
- Atualizar status de pedidos
- Listar pedidos
- Integrar com serviço de pagamento
- Publicar eventos para outros microsserviços

---

## 🔄 Comunicação entre serviços

A comunicação é feita de forma **assíncrona com RabbitMQ**, permitindo desacoplamento entre os serviços.

### 🔁 Fluxo básico:

1. Cliente cria um pedido
2. Pedido é salvo no banco
3. Evento é enviado para fila
4. Serviço de pagamento consome o evento
5. Status do pedido é atualizado conforme pagamento

---

## 📂 Estrutura do projeto
