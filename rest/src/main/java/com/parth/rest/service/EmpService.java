package com.parth.rest.service;

import com.parth.rest.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmpService {
    public Employee create(Employee employee);
    public Optional<Employee> viewbyid(int id);
    public Employee updatedEmp(int id, Employee upEmp);
    public boolean deleteById(int id);
}
