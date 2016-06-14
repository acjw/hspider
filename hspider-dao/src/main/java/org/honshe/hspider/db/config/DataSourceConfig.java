package org.honshe.hspider.db.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by honshe on 2016/6/14.
 */
@Configuration
public class DataSourceConfig {
    @Primary //默认数据源
    @Bean
    @ConfigurationProperties(prefix = "spring.druid",locations = "classpath:db.properties")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }
}
