package org.orm.patterns.instances.active.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type ActiveJdbc configuration.
 */
@SpringBootApplication
public class ActiveJdbcApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ActiveJdbcApplication.class, args);
    }
}
