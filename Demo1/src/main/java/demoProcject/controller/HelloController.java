package demoProcject.controller;

import demoProcject.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello";
    }
}
