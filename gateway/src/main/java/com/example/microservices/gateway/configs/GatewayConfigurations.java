package com.example.microservices.gateway.configs;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@Configuration
public class GatewayConfigurations {

	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p.path("/User/**").uri("lb://USER-SERVICE/User"))
				.route(p->p.path("/Admin/**").uri("lb://ADMIN-SERVICE/Admin"))
				.build();
				
		
	}
}
