package com.bibi.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wzx on 2017/5/12.
 */
@Controller
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/index")
    @ResponseBody
    public String index(HttpServletRequest request){
        return "hello world";
    }

}
