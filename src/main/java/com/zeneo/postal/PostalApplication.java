package com.zeneo.postal;

import com.zeneo.postal.model.Address;
import com.zeneo.postal.model.CSVAddress;
import com.zeneo.postal.repository.AddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.simpleflatmapper.csv.CsvParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class PostalApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(PostalApplication.class, args);
    }

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
