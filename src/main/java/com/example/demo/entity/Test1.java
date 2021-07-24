package com.example.demo.entity;

import java.io.Serializable;

/**
 * (Test1)实体类
 *
 * @author makejava
 * @since 2021-07-22 20:27:26
 */
public class Test1 implements Serializable {
    private static final long serialVersionUID = -76212826238725869L;

    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
