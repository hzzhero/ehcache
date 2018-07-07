package com.itclj.cache;

import java.io.Serializable;

/**
 * Created by lujun.chen on 2017/3/6.
 */
public class Country implements Serializable {
    private static final long serialVersionUID = 2469092908833945125L;

    private String code;

    public Country(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
