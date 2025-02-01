
package io.spings.Ravi;  // Main class package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.spings.Ravi")  // Explicitly tell Spring to scan the package
public class RaviApplication {
	public static void main(String[] args) {
		SpringApplication.run(RaviApplication.class, args);
		System.out.println("hello spring");
	}
}
