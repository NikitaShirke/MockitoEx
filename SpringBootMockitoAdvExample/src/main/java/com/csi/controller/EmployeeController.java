package com.csi.controller;

import com.csi.exception.RecordNotFoundException;
import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Employee>save(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeServiceImpl.save(employee));
    }
    @GetMapping("/findall")
    public  ResponseEntity<List<Employee>>findAll()
    {
        return ResponseEntity.ok(employeeServiceImpl.findAll());
    }
    @GetMapping("/findbyid/{empId}")
    public  ResponseEntity<Optional<Employee>>findById(@PathVariable int empId)
    {
     return ResponseEntity.ok(employeeServiceImpl.findById(empId));
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<Employee>update(@PathVariable int empId,@RequestBody Employee employee)
    {

          return ResponseEntity.ok(employeeServiceImpl.update(employee));
    }

    @DeleteMapping("/deletebyid/{empId}")
    public ResponseEntity<String>deleteById(@PathVariable int empId)
    {
      employeeServiceImpl.deleteById(empId);
      return ResponseEntity.ok("Data Deleted Successfully");
    }
    @DeleteMapping("/deleteall")
    public ResponseEntity<String>deleteAll()
    {
        employeeServiceImpl.deleteAll();
        return ResponseEntity.ok("All Data Deleted Successfully");
    }
}
