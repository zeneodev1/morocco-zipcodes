package com.zeneo.postal.service;

import com.zeneo.postal.model.Address;
import com.zeneo.postal.repository.AddressRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public List<Address> getAddressesByZipCode(String code) {
        return addressRepository.findAllByZipCode(code);
    }

    public List<Address> getAddressesByCity(String city) {
        return addressRepository.findAllByCityStartingWith(city.toUpperCase());
    }

}
