package org.example.DatabaseConfig;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource primaryDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties(prefix = "spring.second-datasource")
    public DataSource secondaryDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "secondaryJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(@Qualifier("secondaryDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "softAchatDataSource")
    @ConfigurationProperties(prefix = "spring.softachat-datasource")
    public DataSource softAchatDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "softAchatJdbcTemplate")
    public JdbcTemplate softAchatJdbcTemplate(@Qualifier("softAchatDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "softTravelDataSource")
    @ConfigurationProperties(prefix = "spring.softtravel.datasource")
    public DataSource softTravelDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "softTravelJdbcTemplate")
    public JdbcTemplate softTravelJdbcTemplate(@Qualifier("softTravelDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "depDataSource")
    @ConfigurationProperties(prefix = "spring.dep.datasource")
    public DataSource depDataSource() {
        return new HikariDataSource();
    }

    @Bean(name = "depJdbcTemplate")
    public JdbcTemplate depJdbcTemplate(@Qualifier("depDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "sirhDataSource")
    @ConfigurationProperties(prefix = "spring.sirh-datasource")
    public DataSource sirhDataSource() {
        return DataSourceBuilder.create().build();
    }
}

