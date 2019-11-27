package com.project.currencyconverter.service;

import com.project.currencyconverter.model.AvailableCurrencies;
import com.project.currencyconverter.model.DTO.CalculateDTO;
import com.project.currencyconverter.model.SingleCurrency;

public interface NbpApi {

    AvailableCurrencies[] getCurrencies();

    SingleCurrency getRates(String currencyCode);
}
