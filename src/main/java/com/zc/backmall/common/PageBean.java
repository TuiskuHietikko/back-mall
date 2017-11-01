package com.zc.backmall.common;

import java.util.LinkedList;
import java.util.List;

/**
 * bootstrap-table结果实体类
 * Created by Administrator on 2017/4/19.
 */
public class PageBean {
    private Long total;
    private List rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public PageBean(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageBean() {
        this.total = 0L;
        this.rows=new LinkedList<>();
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
