package com.shiv.EmployeeAddressApp.repo;

import com.shiv.EmployeeAddressApp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

//    @Query(value = "select * from address_tbl where address_id =:id",nativeQuery = true)
//    public Address getById(Long id);

//    @Query(value = "UPDATE address_tbl SET street = newAddress.street, city = newAddress.city where address_id =:2",nativeQuery = true)
//    void updateAddress(Address newAddress);
}
