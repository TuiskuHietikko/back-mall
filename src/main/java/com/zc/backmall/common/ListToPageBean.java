package com.zc.backmall.common;

import java.util.List;

/**
 * Created by Administrator on 2017/5/23.
 */
public class ListToPageBean {
    public static PageBean changeValueOfPageBean(List list){
        PageBean pageBean=new PageBean();
        if (list==null||list.size()==0){
            pageBean.setRows(null);
            pageBean.setTotal(0L);
        }else {
            pageBean.setRows(list);
            pageBean.setTotal(new Long(list.size()));
        }
        return pageBean;
    }
}
