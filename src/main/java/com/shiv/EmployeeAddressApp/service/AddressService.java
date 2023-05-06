package com.shiv.EmployeeAddressApp.service;

import com.shiv.EmployeeAddressApp.model.Address;
import com.shiv.EmployeeAddressApp.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private  IAddressRepo addressRepo;
    public List<Address> getAllAddresses() {
       return addressRepo.findAll();
    }

    public Address addAddress(Address address) {
        return  addressRepo.save(address);
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).get();
    }

    public void deleteAddress(Long id) {
        addressRepo.deleteById(id);
    }


    public Address updateAddress(Long id, Address newAddress) {
     Address address = addressRepo.findById(id).get();
        address.setState(newAddress.getState());
        address.setZipcode(newAddress.getZipcode());
        address.setStreet(newAddress.getStreet());
        address.setCity(newAddress.getCity());

      return address;
    }
}
