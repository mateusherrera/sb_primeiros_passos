package io.github.mateusherrera.sb_primeiros_passos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point para a aplicação Spring Boot.
 * Primeiros passos do curso: Spring Boot Expert: JPA, REST, JWT, OAuth2 com Docker e AWS.
 *
 * @author Mateus Herrera
 * @since 2025-06-08
 */
@SpringBootApplication
public class ProdutosApiApplication {

	/**
	 * Método principal que inicia a aplicação Spring Boot.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}

}
