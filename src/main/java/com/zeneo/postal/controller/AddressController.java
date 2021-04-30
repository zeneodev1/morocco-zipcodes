package com.zeneo.postal.controller;

import com.zeneo.postal.model.Address;
import com.zeneo.postal.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/find")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @CrossOrigin
    @GetMapping("/city/{city}")
    public Page<Address> getCityAddresses(@PathVariable String city) {
        return addressService.getAddressesByCity(city);
    }

    @CrossOrigin
    @GetMapping("/zip/{zipCode}")
    public List<Address> getCodeAddresses(@PathVariable String zipCode) {
        return addressService.getAddressesByZipCode(zipCode);
    }

}
