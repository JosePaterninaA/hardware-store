package com.store.hardwarestore.controllers;

import com.store.hardwarestore.model.Employee;
import com.store.hardwarestore.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/employees", "/empls"})
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(path="/add")
    public ResponseEntity<String> addEmployee (@RequestParam String firstName, @RequestParam String lastName) {

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);

        employeeRepository.save(employee);

        return new ResponseEntity<>("Saved", HttpStatus.OK);
    }

    @GetMapping(path="/")
    public Iterable<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
