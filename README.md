# 📦 Microsserviço de Pedidos

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-Messaging-orange)
![Docker](https://img.shields.io/badge/Docker-Container-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![GitHub repo size](https://img.shields.io/github/repo-size/cauacouto/microservice-pedidos)
![GitHub stars](https://img.shields.io/github/stars/cauacouto/microservice-pedidos)
![GitHub last commit](https://img.shields.io/github/last-commit/cauacouto/microservice-pedidos)

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
