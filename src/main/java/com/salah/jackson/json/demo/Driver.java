package com.salah.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());

            Student.Address address = student.getAddress();
            System.out.println(address);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
