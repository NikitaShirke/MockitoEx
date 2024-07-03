package com.csi.service.test;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import com.csi.service.EmployeeService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {
    @Autowired
    EmployeeService employeeServiceImpl;
    @MockBean
    EmployeeRepo employeeRepo;

    @Test
    public void saveTest() {
        Employee employee = new Employee(101, "NIKITA", "KARAD", 9000000, 8547657359L, new Date(), "NIKITA@Gmail.com", "NIKITA");
        employeeServiceImpl.save(employee);
        Mockito.verify(employeeRepo, Mockito.times(1)).save(employee);
    }
    @Test
    public void findAllTest()
    {
        Mockito.when(employeeRepo.findAll()).thenReturn(Stream.of(new Employee(101, "NIKITA", "KARAD", 9000000, 8547657359L, new Date(), "NIKITA@Gmail.com", "NIKITA"),
                new Employee(106, "RADHA", "KARAD", 7800000, 85417657359L, new Date(), "RADHA@Gmail.com", "RADHA"),
        new Employee(109, "NIKITA", "SATARA", 6700000, 85476257359L, new Date(), "SAI@Gmail.com", "SAI")).toList());

        Assertions.assertEquals(3,employeeServiceImpl.findAll().size());
    }
   @Test
    public void updateTest()
   {
       Employee employee = new Employee(101, "NIKITA", "KARAD", 9000000, 8547657359L, new Date(), "NIKITA@Gmail.com", "NIKITA");
       employeeServiceImpl.update(employee);
      Mockito.verify(employeeRepo,Mockito.times(1)).save(employee);
   }
   @Test
   public void deleteByIdTest()
   {
       Employee employee = new Employee(101, "NIKITA", "KARAD", 9000000, 8547657359L, new Date(), "NIKITA@Gmail.com", "NIKITA");
       employeeServiceImpl.deleteById(employee.getEmpID());
       Mockito.verify(employeeRepo,Mockito.times(1)).deleteById(employee.getEmpID());
   }
}
