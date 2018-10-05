package com.cg.MongoDB;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface DBServices extends MongoRepository<Employee, Long>{}
