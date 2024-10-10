package com.renchao.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String sex;

    /**
     *
     */
    private Date brithday;

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     */
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     *
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }


}
