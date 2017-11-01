package com.zc.backmall.controller;

import com.zc.backmall.common.Page;
import com.zc.backmall.common.PageBean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuxi on 2017/10/31.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping(value = "/list")
    public String list(){
        return "product/list";
    }

    @RequestMapping(value = "/list/data",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Object getListData(Page page){
        List<Object> list=new ArrayList<>();
        Map<String,Object> map1=new HashMap<>();
        map1.put("name","test1");
        map1.put("sex","男");
        list.add(map1);

        Map<String,Object> map2=new HashMap<>();
        map2.put("name","test2");
        map2.put("sex","男");
        list.add(map2);

        Map<String,Object> map3=new HashMap<>();
        map3.put("name","test3");
        map3.put("sex","男");
        list.add(map3);

        Map<String,Object> map4=new HashMap<>();
        map4.put("name","test4");
        map4.put("sex","男");
        list.add(map4);

        PageBean pageBean=new PageBean();
        pageBean.setRows(list);
        pageBean.setTotal(4L);
        return pageBean;
    }
}
