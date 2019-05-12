package com.example.demo5.model;

import javax.annotation.Generated;

public class Homecampaign {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cpone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cptwo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cpthree;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTitle() {
        return title;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCpone() {
        return cpone;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCpone(String cpone) {
        this.cpone = cpone == null ? null : cpone.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCptwo() {
        return cptwo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCptwo(String cptwo) {
        this.cptwo = cptwo == null ? null : cptwo.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCpthree() {
        return cpthree;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCpthree(String cpthree) {
        this.cpthree = cpthree == null ? null : cpthree.trim();
    }
}