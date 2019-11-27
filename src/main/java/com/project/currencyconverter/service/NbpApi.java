package com.project.currencyconverter.service;

import com.project.currencyconverter.model.DTO.AvailableCurrencies;
import com.project.currencyconverter.model.DTO.SingleCurrency;

/**
 * Calls NBP API in order to receive available currencies or exchange rates of a given currency
 */
public interface NbpApi {

    /**
     * Calls NBP API in order to receive available currencies
     * @return - returns currencies
     */
    AvailableCurrencies[] getCurrencies();

    /**
     * Calls NBP API in order to receive exchange rates of a given currency
     * @param currencyCode - a given currency to check
     * @return - returns data of a given currency
     */
    SingleCurrency getRates(String currencyCode);
}
