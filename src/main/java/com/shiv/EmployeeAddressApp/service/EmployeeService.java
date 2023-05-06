package com.shiv.EmployeeAddressApp.service;

import com.shiv.EmployeeAddressApp.model.Employee;
import com.shiv.EmployeeAddressApp.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;
    public List<Employee> getAllAddresses() {
       return employeeRepo.findAll();
    }



    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public String updateEmployee(Long id, Employee newEmployee) {
//        Employee employee = employeeRepo.findById(id).get();
//
//        employee.setEmployee_address(newEmployee.getEmployee_address());
//        employee.setFirst_name(newEmployee.getFirst_name());
//        employee.setLast_name(newEmployee.getLast_name());
          employeeRepo.deleteById(id);
          addEmployee(newEmployee);

          return "saved";



    }


    public String deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "deleted";
    }

    public Employee getEmployeesById(Long id) {
        return employeeRepo.findById(id).get();
    }
}
