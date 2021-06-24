package com.udhaya.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udhaya.pack.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
