package com.hcl.cnp.patientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;

import java.time.Duration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class PatientServiceApplication {

	@Bean
	RouterFunction<?> routes() {
		return
				route(GET("delay"), r -> ok().body(Flux.just("Hello HCL!").delayElements(Duration.ofSeconds(10)), String.class));
	}

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}
}
