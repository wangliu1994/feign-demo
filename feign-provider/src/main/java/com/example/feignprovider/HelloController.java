package com.example.feignprovider;


import org.springframework.web.bind.annotation.*;

/**
 * @author : winnie
 * @date : 2019/3/13
 * @desc
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        if (name == null || name.isEmpty()) {
            return "Hello World";
        } else {
            return "Hello " + name;
        }
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2(@RequestHeader String name) {
        if (name == null || name.isEmpty()) {
            return "Hello World";
        } else {
            return "Hello " + name;
        }
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello3(@RequestBody String name) {
        if (name == null || name.isEmpty()) {
            return "Hello World";
        } else {
            return "Hello " + name;
        }
    }
}
