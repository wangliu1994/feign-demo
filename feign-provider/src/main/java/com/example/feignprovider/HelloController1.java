package com.example.feignprovider;

import com.example.HelloService1;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : winnie
 * @date : 2019/3/18
 * @desc
 */
@RestController
public class HelloController1 implements HelloService1 {

    @Override
    public String helloH1() {
        return "Hello1 World";
    }

    @Override
    public String hello1H1(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello1 World";
        } else {
            return "Hello1 " + name;
        }
    }

    @Override
    public String hello2H1(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello1 World";
        } else {
            return "Hello1 " + name;
        }
    }

    @Override
    public String hello3H1(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello1 World";
        } else {
            return "Hello1 " + name;
        }
    }
}
