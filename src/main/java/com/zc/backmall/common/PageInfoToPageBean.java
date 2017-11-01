package com.zc.backmall.common;

import com.github.pagehelper.PageInfo;

/**
 * 把PageInfo装换成PageBean
 * Created by Administrator on 2017/4/19.
 */
@SuppressWarnings("unchecked")
public class PageInfoToPageBean {
    public static PageBean changeValueOfPageBean(PageInfo pageInfo){
        PageBean pageBean=new PageBean();
        if (pageInfo==null||pageInfo.getTotal()==0){
            pageBean.setRows(null);
            pageBean.setTotal(0L);
        }else {
            pageBean.setRows(pageInfo.getList());
            pageBean.setTotal(pageInfo.getTotal());
        }
        return pageBean;
    }
}
