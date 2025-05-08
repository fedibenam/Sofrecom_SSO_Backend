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
        basePackages = "org.example.repository.softachat", // Replace with your repository package
        entityManagerFactoryRef = "softAchatEntityManagerFactory",
        transactionManagerRef = "softAchatTransactionManager"
)
public class SoftAchatDatabaseConfig {

    @Bean(name = "softAchatEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean softAchatEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("softAchatDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("org.example.Entity.softachat") // Replace with your entity package
                .persistenceUnit("softAchat")
                .build();
    }

    @Bean(name = "softAchatTransactionManager")
    public PlatformTransactionManager softAchatTransactionManager(
            @Qualifier("softAchatEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}