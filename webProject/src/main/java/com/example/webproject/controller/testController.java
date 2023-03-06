package com.example.webproject.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(tags="测试API")
@RestController
public class testController {
    @ApiOperation(value = "打印HelloWorld")
    @RequestMapping("/test")
    public Map HelloWorld() {
        Map<String, String> map = new HashMap<>();
        map.put("test", "HelloWorld");
        return map;
    }
}
