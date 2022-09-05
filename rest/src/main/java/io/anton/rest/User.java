package io.anton.rest;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    public String id;
    public String name;
    public int bigdatausingr;
    public int dataanalytics;
    public int deeplearning;
    public int fullstacktheory;
    public int fullstacklab;
    public int mobileappdevelopment;
    public int advancejava;

}
