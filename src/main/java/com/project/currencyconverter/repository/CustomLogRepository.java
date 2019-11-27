package com.project.currencyconverter.repository;

import com.project.currencyconverter.model.CustomLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomLogRepository extends MongoRepository<CustomLog, String> {

}
