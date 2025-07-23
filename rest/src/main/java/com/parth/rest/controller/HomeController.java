package com.parth.rest.controller;

import com.parth.rest.entities.Employee;
import com.parth.rest.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    private EmpService empService;
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return empService.create(employee);
    }
    @GetMapping("/view/{id}")
    public ResponseEntity<Employee> viewEmp(@PathVariable int id)
    {
        Optional<Employee> getEmp=empService.viewbyid(id);
        if(getEmp.isPresent())
        {
            return new ResponseEntity<>(getEmp.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> update(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        Employee updated = empService.updatedEmp(id, updatedEmployee);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id)
    {
        boolean del=empService.deleteById(id);
        if(del)
        {
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
