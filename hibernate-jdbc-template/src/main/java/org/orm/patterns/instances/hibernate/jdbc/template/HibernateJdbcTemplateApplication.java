package org.orm.patterns.instances.hibernate.jdbc.template;

import org.orm.patterns.instances.commons.CommonsApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Hibernate JdbcTemplate configuration.
 */
@SpringBootApplication(scanBasePackageClasses = {
        CommonsApplication.class,
        HibernateJdbcTemplateApplication.class
})
public class HibernateJdbcTemplateApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HibernateJdbcTemplateApplication.class, args);
    }
}
