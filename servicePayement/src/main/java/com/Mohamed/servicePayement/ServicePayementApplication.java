package com.Mohamed.servicePayement;

import com.Mohamed.servicePayement.entity.Payment;
import com.Mohamed.servicePayement.repo.PaymentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class ServicePayementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePayementApplication.class, args);
	}

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
		return RepositoryRestConfigurer.withConfig(config -> {
			config.exposeIdsFor(Payment.class);
		});
	}
	@Bean
	CommandLineRunner commandLineRunner(PaymentRepo paymentRepo){
		return args -> {
			paymentRepo.save(new Payment(null,"IPHONE","testeA"));
			paymentRepo.save(new Payment(null,"DELL LAPTOP","testeB"));
			paymentRepo.save(new Payment(null,"PS5","testeC"));
		};
	}

}
