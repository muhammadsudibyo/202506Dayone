package com.dayoneGW.dayoneGW;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class CustomFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
	    System.out.println("Before request processing");
	    return chain.filter(exchange).then(Mono.fromRunnable(() -> {
	      System.out.println("After response processing");
	    }));
	}
	
	

}
