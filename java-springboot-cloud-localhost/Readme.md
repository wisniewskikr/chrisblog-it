Spring Boot Cloud:
- **Eureka**: cloud naming service. This service stores names of all services in the network. It's easier to manage them;
- **Gateway**: clouud gateway service. This service is user's entrypoint for all other services in the network. All services in the network can have different domains and/or ports but for user everything will look the same;
- **Ribbon**: cloud loadbalancer service. This service manages traffic from entrypoint to two or more other services (for instance Display Service and two Text Services). This service decides which other sevice should be called.

Ribbon:
- version 2021.0.1?
- only RestTemplate ?