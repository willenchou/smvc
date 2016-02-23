package com.test.model;

public class Order {
    private Long positionInt;

    private String kjCustomerAcco;

    private Integer updateDate;

    private Integer updateTime;

    public Long getPositionInt() {
        return positionInt;
    }

    public void setPositionInt(Long positionInt) {
        this.positionInt = positionInt;
    }

    public String getKjCustomerAcco() {
        return kjCustomerAcco;
    }

    public void setKjCustomerAcco(String kjCustomerAcco) {
        this.kjCustomerAcco = kjCustomerAcco == null ? null : kjCustomerAcco.trim();
    }

    public Integer getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}