package org.example.DatabaseConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "org.example.repository.dep", // Replace with your repository package
        entityManagerFactoryRef = "depEntityManagerFactory",
        transactionManagerRef = "depTransactionManager"
)
public class DepDatabaseConfig {

    @Bean(name = "depEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean depEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("depDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("org.example.Entity.dep") // Replace with your entity package
                .persistenceUnit("dep")
                .build();
    }

    @Bean(name = "depTransactionManager")
    public PlatformTransactionManager depTransactionManager(
            @Qualifier("depEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}