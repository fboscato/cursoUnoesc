package br.edu.unoesc.exemplo_H2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.unoesc.exemplo_H2.model.Livro;
import br.edu.unoesc.exemplo_H2.repository.LivroRepository;

@SpringBootApplication
public class ExemploH2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExemploH2Application.class, args);
	}

	@Bean
	CommandLineRunner CommandLineRunner(LivroRepository repositorio) {
		return args -> {
			Livro l = new Livro(null, "O senhor dos pasteis", 888, "Tolkin");
			repositorio.save(l);
			
			System.out.println(repositorio.findAll());
		};
	}
}
