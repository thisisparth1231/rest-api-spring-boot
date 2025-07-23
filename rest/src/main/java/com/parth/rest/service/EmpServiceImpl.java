package com.parth.rest.service;

import com.parth.rest.entities.Employee;
import com.parth.rest.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpRepository empRepository;
    @Override
    public Employee create(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public Optional<Employee> viewbyid(int id) {
        return empRepository.findById(id);
    }

    public Employee updatedEmp(int id, Employee updatedEmp) {
        return empRepository.findById(id).map(emp -> {
            emp.setName(updatedEmp.getName());
            emp.setDepartment(updatedEmp.getDepartment());
            return empRepository.save(emp);
        }).orElse(null);
    }

    @Override
    public boolean deleteById(int id) {
        if(empRepository.existsById(id))
        {
            empRepository.deleteById(id);
            return true;
        }
        else
        {
            return false;
        }
    }

}
