#Ribbon
Interview Answer (Perfect)

Ribbon was Netflix’s client-side load balancer used in Spring Boot 2. It was deprecated because Netflix stopped maintaining it and it lacked reactive and cloud-native support.
Spring replaced it with Spring Cloud LoadBalancer, a lightweight, actively maintained, and reactive-compatible load balancer integrated into Spring Cloud ecosystem.
---

--> Ribbon used static server configuration, whereas Spring Cloud LoadBalancer relies on dynamic service discovery via Eureka, eliminating the need for manual server configuration.
--
