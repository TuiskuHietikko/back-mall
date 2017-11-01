package com.zc.backmall.common;

import java.util.LinkedList;
import java.util.List;

/**
 * bootstrap-table结果实体类
 * Created by Administrator on 2017/4/19.
 */
public class Page {
    private int limit;
    private int pagination;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPagination() {
        return pagination;
    }

    public void setPagination(int pagination) {
        this.pagination = pagination;
    }
}
