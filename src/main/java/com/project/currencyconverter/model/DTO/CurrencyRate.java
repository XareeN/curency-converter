package com.project.currencyconverter.model.DTO;

public class CurrencyRate {
    String number;
    String effectiveDate;
    float bid;
    float ask;

    public String getNumber() {
        return number;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public float getBid() {
        return bid;
    }

    public float getAsk() {
        return ask;
    }
}
