package com.cg.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DBServices extends MongoRepository<Employee, Long>{}
