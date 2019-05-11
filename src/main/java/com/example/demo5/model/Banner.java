package com.example.demo5.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.annotation.Generated;


public class Banner {
    @JSONField(name = "ID")
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;
    @JSONField(name = "NAME")
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;
    @JSONField(name = "IMGURL")
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String imgurl;
    @JSONField(name = "TYPE")
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getImgurl() {
        return imgurl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", imgurl=" + imgurl
                + ", type=" + type + "]";
    }
}