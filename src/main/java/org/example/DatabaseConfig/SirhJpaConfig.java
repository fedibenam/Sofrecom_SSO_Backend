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
        basePackages = "org.example.Repository.sirh",
        entityManagerFactoryRef = "sirhEntityManagerFactory",
        transactionManagerRef = "sirhTransactionManager"
)
public class SirhJpaConfig {

    @Bean(name = "sirhEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean sirhEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("sirhDataSource") DataSource sirhDataSource) {
        return builder
                .dataSource(sirhDataSource)
                .packages("org.example.Entity.sirh")
                .persistenceUnit("sirh")
                .build();
    }

    @Bean(name = "sirhTransactionManager")
    public PlatformTransactionManager sirhTransactionManager(
            @Qualifier("sirhEntityManagerFactory") EntityManagerFactory sirhEntityManagerFactory) {
        return new JpaTransactionManager(sirhEntityManagerFactory);
    }
}