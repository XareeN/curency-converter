package com.project.currencyconverter.model;

import java.util.List;

public class AvailableCurrencies {

    String table;
    String no;
    String tradingDate;
    String effectiveDate;
    List<Currency> rates;

    public String getTable() {
        return table;
    }

    public String getNo() {
        return no;
    }

    public String getTradingDate() {
        return tradingDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public List<Currency> getRates() {
        return rates;
    }
}
