package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//控制器类
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(HttpServletRequest req , HttpServletResponse cc){
        System.out.println("hello springmvc");
        return "success";
    }

}
