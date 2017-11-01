package com.zc.backmall.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/10/26.
 */
@Controller
@RequestMapping(value = "/page")
public class IndexController {

    /**
     * 转入主页
     * @return
     */
    @RequestMapping(value = "index")
    public String toIndexPage(){

        return "index";
    }
}
