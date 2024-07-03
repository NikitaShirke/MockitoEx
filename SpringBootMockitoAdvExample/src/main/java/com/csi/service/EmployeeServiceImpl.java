package com.csi.service;

import com.csi.exception.RecordNotFoundException;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepoImpl;

    @Override
    public Employee save(Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    @Override
    public Optional<Employee> findById(int empId) {


        return employeeRepoImpl.findById(empId);

    }

    @Override
    public List<Employee> findAll()
    {
        return employeeRepoImpl.findAll();
    }

    @Override
    public Employee update(Employee employee)
    {
        return employeeRepoImpl.save(employee);
    }

    @Override
    public void deleteById(int empId) {

        employeeRepoImpl.deleteById(empId);
    }

    @Override
    public void deleteAll() {
        employeeRepoImpl.deleteAll();
    }
}
