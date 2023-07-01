package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.app.document.Employee;
import com.app.repo.EmployeeRepo;

@Component
public class MongoDBExternalAllBasicOperation implements ApplicationRunner {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.deleteAll();
		Employee emp = new Employee();
		emp.setId("101");
		emp.setEmpID(10);
		emp.setEmpName("John");
		emp.setEmpAdd("bls");

		Employee emp1 = new Employee();
		emp1.setId("102");
		emp1.setEmpID(20);
		emp1.setEmpName("Mike");
		emp1.setEmpAdd("mbj");

		Employee emp2 = new Employee();

		emp2.setId("102");
		emp2.setEmpID(20);
		emp2.setEmpName("Mike");
		emp2.setEmpAdd("mbj");

		Employee emp3 = new Employee();
		emp3.setId("103");
		emp3.setEmpID(30);
		emp3.setEmpName("Rinku");
		emp3.setEmpAdd("mbj");

		Employee emp4 = new Employee();
		emp4.setId("104");
		emp4.setEmpID(40);
		emp4.setEmpName("Moon");
		emp4.setEmpAdd("mbj");

		Employee emp5 = new Employee();

		emp5.setId("105");
		emp5.setEmpID(50);
		emp5.setEmpName("Kamal");
		emp5.setEmpAdd("mbj");
		
		List<Employee> employees=Arrays.asList(emp,emp1,emp2,emp2,emp3,emp4,emp5);
		
		repo.saveAll(employees);

		/*
		 * repo.save(new Employee("101",10,"uday","hyd")); repo.save(new
		 * Employee("102",11,"uday","bangalore")); repo.save(new
		 * Employee("103",12,"uday","mumbai"));
		 */
		System.out.println("---------------------");
		repo.findAll().forEach(System.out::println);

		
	}

}
