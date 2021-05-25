package com.saurabh.service;

import com.saurabh.entity.Employee;
import com.saurabh.repository.EmployeeRepository;
import com.saurabh.repository.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        // business logic to handle null
        Employee e = repository.findOne(id);
        if(e==null) {
            return null;
        }else {
            return e;
        }

    }

    @Override
    public Employee create(Employee e) {
        return null;
    }

    @Override
    public Employee update(String id, Employee e) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
