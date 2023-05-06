package com.shiv.EmployeeAddressApp.controller;

import com.shiv.EmployeeAddressApp.model.Address;
import com.shiv.EmployeeAddressApp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
       return addressService.getAllAddresses();
    }

    @GetMapping("addresses/{id}")
    public Address getAllAddresses(@PathVariable Long id ){
        return addressService.getAddressById(id);
    }
    @PostMapping("addresses")
    public Address addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @DeleteMapping("addresses/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }

    @PutMapping("addresses/{id}")
    public Address updateAddress(@PathVariable Long id ,@RequestBody Address address ){
        return  addressService.updateAddress(id,address);
    }

}
