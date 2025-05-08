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
        basePackages = "org.example.repository.softtravel", // Replace with your repository package
        entityManagerFactoryRef = "softTravelEntityManagerFactory",
        transactionManagerRef = "softTravelTransactionManager"
)
public class SoftTravelDatabaseConfig {

    @Bean(name = "softTravelEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean softTravelEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("softTravelDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("org.example.Entity.softtravel") // Replace with your entity package
                .persistenceUnit("softTravel")
                .build();
    }

    @Bean(name = "softTravelTransactionManager")
    public PlatformTransactionManager softTravelTransactionManager(
            @Qualifier("softTravelEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}