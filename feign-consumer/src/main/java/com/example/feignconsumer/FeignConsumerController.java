package com.example.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : winnie
 * @date : 2019/3/18
 * @desc
 */
@RestController
public class FeignConsumerController {
    @Autowired
    HelloService helloService;

//    @RequestMapping("/test-hello")
//    public String hello() {
//        return helloService.hello();
//    }
//
//    @RequestMapping("/test-hello1")
//    public String hello1() {
//        return helloService.hello1("hello1");
//    }
//
//    @RequestMapping("/test-hello2")
//    public String hello2() {
//        return helloService.hello2("hello2");
//    }
//
//    @RequestMapping("/test-hello3")
//    public String hello3() {
//        return helloService.hello3("hello3");
//    }

    @RequestMapping("/test-h1-hello")
    public String helloH1() {
        return helloService.helloH1();
    }

    @RequestMapping("/test-h1-hello1")
    public String hello1H1() {
        return helloService.hello1H1("hello1");
    }

    @RequestMapping("/test-h1-hello2")
    public String hello2H1() {
        return helloService.hello2H1("hello2");
    }

    @RequestMapping("/test-h1-hello3")
    public String hello3H1() {
        return helloService.hello3H1("hello3");
    }
}
