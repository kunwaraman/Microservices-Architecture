#Ribbon
Interview Answer (Perfect)

Ribbon was Netflix’s client-side load balancer used in Spring Boot 2. It was deprecated because Netflix stopped maintaining it and it lacked reactive and cloud-native support.
Spring replaced it with Spring Cloud LoadBalancer, a lightweight, actively maintained, and reactive-compatible load balancer integrated into Spring Cloud ecosystem.
---

--> Ribbon used static server configuration, whereas Spring Cloud LoadBalancer relies on dynamic service discovery via Eureka, eliminating the need for manual server configuration.
--
In One Line

RabbitMQ moves data between services
Zipkin shows how data moved

Interview Ready Answer

RabbitMQ is a message broker used for asynchronous communication between microservices, ensuring reliability and decoupling. Zipkin is a distributed tracing system used to monitor and visualize the flow of a request across multiple services to identify latency and failures.
--

Microservices Flow
--
Client (Mobile/Web)
↓
API Gateway
↓
Microservices (User, Order, Product, Payment...)
↓
They communicate using:
Feign + Eureka + Kafka + Redis
↓
Everything monitored by:
Zipkin + Admin Server
↓
Configured by:
Config Server
