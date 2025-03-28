package edu.eci.arep.mathservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MathservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathservicesApplication.class, args);
	}

	private static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 8081;
	}

}
