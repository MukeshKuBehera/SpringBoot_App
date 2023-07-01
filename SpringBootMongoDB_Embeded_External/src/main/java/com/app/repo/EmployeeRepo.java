package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.document.Employee;

public interface EmployeeRepo extends MongoRepository<Employee,String> {

}
