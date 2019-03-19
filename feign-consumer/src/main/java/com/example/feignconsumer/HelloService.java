package com.example.feignconsumer;

import com.example.HelloService1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : winnie
 * @date : 2019/3/18
 * @desc
 */
@FeignClient("feign-provider")
public interface HelloService extends HelloService1 {
//    /**
//     * 使用provider服务的 /hello接口
//     */
//    @RequestMapping("/hello")
//    String hello();
//
//    @RequestMapping("/hello1")
//    String hello1(@RequestParam(value = "name") String name);
//
//    @RequestMapping("/hello2")
//    String hello2(@RequestHeader(value = "name") String name);
//
//    @RequestMapping("/hello3")
//    String hello3(@RequestBody String name);
}
