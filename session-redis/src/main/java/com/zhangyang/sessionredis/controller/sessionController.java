package com.zhangyang.sessionredis.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Api(tags = "session域")
@RestController
@RequestMapping("/api/session/test")
public class sessionController {
    @GetMapping("/value/{name}")
    public  String sessionSet(@PathVariable String name, HttpSession httpSession)
    {
        httpSession.setAttribute("name",name);
        return "session存储成功";

    }
    @GetMapping("/get")
    public  String sessionGet( HttpSession httpSession)
    {
        Object name = httpSession.getAttribute("name");
        System.out.println(name.toString());
        return "session读取成功";

    }
}
