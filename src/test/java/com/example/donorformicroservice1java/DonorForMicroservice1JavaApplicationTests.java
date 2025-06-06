package com.example.donorformicroservice1java;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DonorForMicroservice1JavaApplicationTests {

    @Test
    void contextLoads() {
    }

}
