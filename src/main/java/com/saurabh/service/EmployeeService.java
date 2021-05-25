package com.saurabh.service;

import com.saurabh.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findOne(String id);
    Employee create(Employee e);
    Employee update(String id, Employee e);
    void delete(String id);
    
}
