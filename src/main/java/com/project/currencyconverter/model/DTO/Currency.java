package com.project.currencyconverter.model.DTO;

public class Currency {

    String currency;
    String code;
    float bid;
    float ask;

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public float getBid() {
        return bid;
    }

    public float getAsk() {
        return ask;
    }
}
