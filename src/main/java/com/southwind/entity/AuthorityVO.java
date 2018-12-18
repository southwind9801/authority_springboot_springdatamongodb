package com.southwind.entity;

import java.util.List;

public class AuthorityVO {
    private int code;
    private String msg;
    private long count;
    private List<Authority> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<Authority> getData() {
        return data;
    }

    public void setData(List<Authority> data) {
        this.data = data;
    }
}
