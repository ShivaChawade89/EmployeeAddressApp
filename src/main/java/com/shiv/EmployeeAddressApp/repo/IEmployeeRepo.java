package com.shiv.EmployeeAddressApp.repo;

import com.shiv.EmployeeAddressApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
