package com.example.demo5.vo;

public class HomeCampaignVO {

    long id;
    String title;
    CampaignVO cpOne;
    CampaignVO cpTwo;
    CampaignVO cpThree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CampaignVO getCpOne() {
        return cpOne;
    }

    public void setCpOne(CampaignVO cpOne) {
        this.cpOne = cpOne;
    }

    public CampaignVO getCpTwo() {
        return cpTwo;
    }

    public void setCpTwo(CampaignVO cpTwo) {
        this.cpTwo = cpTwo;
    }

    public CampaignVO getCpThree() {
        return cpThree;
    }

    public void setCpThree(CampaignVO cpThree) {
        this.cpThree = cpThree;
    }
}
