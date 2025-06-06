package com.example.donorformicroservice1java;

import org.springframework.boot.SpringApplication;

public class TestDonorForMicroservice1JavaApplication {

    public static void main(String[] args) {
        SpringApplication.from(DonorForMicroservice1JavaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
