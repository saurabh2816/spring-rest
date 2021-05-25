package com.saurabh.repository;

import com.saurabh.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("saurabh", "saurabh2816@gmail.com", 0));
        employees.add(new Employee("ronak", "ronak@gmail.com", 111110));
        employees.add(new Employee("abc", "abc@gmail.com", 33330));
        return employees;
    }

    @Override
    public Employee findOne(String id) {
//        Employee e = new Employee("bill gates", "bgates@gmail.com", 500000);
//        return e;
        return null;
    }
}
