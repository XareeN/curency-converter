package com.project.currencyconverter.config;

import com.project.currencyconverter.repository.CustomLogRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = CustomLogRepository.class)
@Configuration
public class MongoDBConfig {
}
