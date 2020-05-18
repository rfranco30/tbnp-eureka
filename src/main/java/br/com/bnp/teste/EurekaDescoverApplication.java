package br.com.bnp.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDescoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDescoverApplication.class, args);
	}

}
