package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : winnie
 * @date : 2019/3/18
 * @desc Feign的继承特性
 */
@RequestMapping("/h1")
public interface HelloService1 {
    @RequestMapping("/hello")
    String helloH1();

    @RequestMapping("/hello1")
    String hello1H1(@RequestParam(value = "name") String name);

    @RequestMapping("/hello2")
    String hello2H1(@RequestHeader(value = "name") String name);

    @RequestMapping("/hello3")
    String hello3H1(@RequestBody String name);
}
