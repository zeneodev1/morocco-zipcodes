package com.zeneo.postal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Address {

    @JsonIgnore
    @Id
    private String id;

    private String city;

    private String zipCode;

    private String district;

}
