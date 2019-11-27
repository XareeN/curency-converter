package com.project.currencyconverter.model.DTO;

import java.util.List;

public class SingleCurrency {
    String table;
    String currency;
    String code;
    List<CurrencyRate> rates;

    public String getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public List<CurrencyRate> getRates() {
        return rates;
    }
}
