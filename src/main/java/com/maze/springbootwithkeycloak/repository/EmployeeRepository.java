package com.maze.springbootwithkeycloak.repository;

import com.maze.springbootwithkeycloak.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
