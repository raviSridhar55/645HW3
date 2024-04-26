/*
 * Program Name: Application Main Class
 * Description: This class serves as the main entry point for the Spring Boot application.
 *              It uses the @SpringBootApplication annotation to enable auto-configuration and component scanning.
 * Author: Ajay Kumar Addike (G01398832)
        Venkata Ravi Sridhar Devarakonda (G01449062)
        Rohith Tangudu (G01409971)
        Arun Chakravarthy Annadata (G01409888)
 * Date: Date of creation or last modification (optional)
 */
package com.swe.hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw3Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw3Application.class, args);
    }

}
