package com.oklimenko.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Do NOT place any *Scan or Enable* annotations here.
 * Place it in /config/*Config class. Otherwise testing uses this class as root scanning and
 * spoils sliced Spring Boot Testing.
 *
 * @author oklimenko@gmail.com
 */
//@SpringBootApplication
//@EntityScan("com.sinol")
//@EnableJpaRepositories("com.sinol")
//@ComponentScan("com.sinol")
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
