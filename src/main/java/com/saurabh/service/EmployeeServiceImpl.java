package com.saurabh.service;

import com.saurabh.Application;
import com.saurabh.entity.Employee;
import com.saurabh.exceptions.EmployeeNotFoundException;
import com.saurabh.repository.EmployeeRepository;
import com.saurabh.repository.EmployeeRepositoryImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    static org.apache.log4j.Logger log = Logger.getLogger(Application.class.getName());

    @Override
    public List<Employee> findAll() {

        return repository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        // business logic to handle null
        Employee e = repository.findOne(id);
        if(e==null) {
            log.info(new EmployeeNotFoundException("Employee with id " + id + " NOT FOUND"));
            throw  new EmployeeNotFoundException("Employee with id " + id + " NOT FOUND");
        }else {
            return e;
        }

    }

    @Override
    public Employee create(Employee e) {
        return e;
    }

    @Override
    public Employee update(String id, Employee e) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
