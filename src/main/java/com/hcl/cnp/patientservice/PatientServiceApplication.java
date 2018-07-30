package com.hcl.cnp.patientservice;

import com.hcl.cnp.patientservice.domain.Patient;
import com.hcl.cnp.patientservice.repository.PatientRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import reactor.core.publisher.Flux;

import java.time.Duration;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
@EnableFeignClients
public class PatientServiceApplication {

	@Bean
	RouterFunction<?> routes() {
		return
				route(GET("/delay"), r -> ok().body(Flux.just("Hello HCL!").delayElements(Duration.ofSeconds(10)), String.class));
	}

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}

	@Bean
	PatientRepository repository() {
		PatientRepository repository = new PatientRepository();
		repository.add(new Patient(null, "Jose", "Boucourt"));
		repository.add(new Patient(null, "Ben", "Winston"));
		repository.add(new Patient(null, "Anil", "Grupta"));
		return repository;
	}
}
