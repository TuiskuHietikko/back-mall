package com.zc.backmall.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/26.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(value = {"/page","/**"})
    public String toLoginPage(){
        return "login/page";
    }

    @RequestMapping(value = "/validate")
    public String validateAccount(@RequestParam("userName") String userName,@RequestParam("password") String password){
        System.out.println(userName);
        System.out.println(password);
        return "redirect:/index";
    }

    @RequestMapping(value ="check",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object check(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","曾超");
        map.put("sex","男");
        return map;
    }

    @RequestMapping(value ="check/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Object checkXML(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","曾超");
        map.put("sex","男");
        return map;
    }

}
