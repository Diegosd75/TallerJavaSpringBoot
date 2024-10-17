package com.company.DataWithJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataWithJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(DataWithJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DataWithJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProyectoRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Proyecto("proyecto1", "Proyecto de software"));
			repository.save(new Proyecto("proyecto2", "Proyecto de construccion"));
			repository.save(new Proyecto("proyecto3", "Proyecto de mecanica"));
			repository.save(new Proyecto("proyecto4", "Proyecto de universidad"));
			repository.save(new Proyecto("proyecto5", "Proyecto de ingles"));


			log.info("Proyectos encontrados con findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(proyecto -> {
				log.info(proyecto.toString());
			});
			log.info("");

			Proyecto proyecto = repository.findById(3L);
			log.info("Proyectos encontrados con findById(3L):");
			log.info("--------------------------------");
			log.info(proyecto.toString());
			log.info("");

			log.info("Proyectos encontrados con  findByProyecto('proyecto1'):");
			log.info("--------------------------------------------");
			repository.findByProyecto("proyecto1").forEach(proyecto1 -> {
				log.info(proyecto1.toString());
			});
			log.info("");
		};
	}

}
