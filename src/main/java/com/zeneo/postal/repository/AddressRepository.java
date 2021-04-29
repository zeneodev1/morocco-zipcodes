package com.zeneo.postal.repository;

import com.zeneo.postal.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AddressRepository extends MongoRepository<Address, String> {

    List<Address> findAllByZipCode(String code);
    List<Address> findAllByCity(String city);
}
