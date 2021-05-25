package com.saurabh.controller;


import com.saurabh.entity.Employee;
import com.saurabh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    /*
    ### GET
    /api/employees&page=5&size=50&orderBy=name&sortOrder=DESC
   */ // GET
    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll() {
        return service.findAll();
    }

    /*
    GET /api/employees/1001
    Request Payload: None
    Response: {}, 404
    Status: 200, 404, 500
* */ // GET
    @RequestMapping(method = RequestMethod.GET, value="{id}")
    public Employee findOne(@PathVariable("id") String empId) throws Throwable {
        return  service.findOne(empId);
    }

    /*
    ### POST : create employee
    Request: POST /api/employees/
    Request Body: {"name":"Saurabh", "email": "abc@gmail.com", "password": "saurabh"}
    Response: NONE
    Responses:
    200: OK
    204: Non Content
    404: not found
    500:internal server error
     */ // POST
    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee e) {
        return service.create(e);
    }

    /*
    ### PUT : replace the existing resource
    Request: PUT /api/employees/1001
    RequestBody: {"id": 1001, "name": "Saurabh". "email":"saurabh2816@gmail.com", "password":"saurabh"}
    Responses:
    200: {}
    204: Non Content
    404: not found
    500:internal server error
    * */ // PUT (replace existing resource)
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public void update(@PathVariable("id") String id, @RequestBody Employee e) {

    }

    /*
    *Request: DELETE /api/employees/1001
    Response: NONE
    Responses:
    200: {}
    204: Non Content
    404: not found
    500:internal server error
    * */ // DELETE
    @RequestMapping(method = RequestMethod.DELETE, value="{id}")
    public void delete(@PathVariable("id") String id) {

    }



}
