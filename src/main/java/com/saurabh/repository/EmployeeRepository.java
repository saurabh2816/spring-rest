package com.saurabh.repository;

import com.saurabh.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository {

    List<Employee> findAll();
    Employee findOne(String id);

}
