package com.shiv.EmployeeAddressApp.controller;

import com.shiv.EmployeeAddressApp.model.Address;
import com.shiv.EmployeeAddressApp.model.Employee;
import com.shiv.EmployeeAddressApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController{
    @Autowired
    EmployeeService employeeService;
    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllAddresses();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeesById(@PathVariable Long id){
        return employeeService.getEmployeesById(id);
    }


    @PostMapping("employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("employees/{id}")
    public String updateEmployee(@PathVariable Long id ,@RequestBody Employee employee ){
        return  employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployees(@PathVariable Long id){
       return employeeService.deleteEmployee(id);
    }

}
