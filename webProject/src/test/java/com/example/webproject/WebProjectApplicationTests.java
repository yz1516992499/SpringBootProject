package com.example.webproject;

import com.example.webproject.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
class WebProjectApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        Random random  = new Random();
        int l = random.nextInt(100);
        System.out.println(l);
    }

}
