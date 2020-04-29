package com.express.springboot.crudhateoas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.express.springboot.crudhateoas.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

}











