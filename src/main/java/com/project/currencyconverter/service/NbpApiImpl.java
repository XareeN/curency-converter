package com.project.currencyconverter.service;

import com.project.currencyconverter.controller.DefaultCustomLog;
import com.project.currencyconverter.model.AvailableCurrencies;
import com.project.currencyconverter.model.SingleCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpApiImpl implements NbpApi {

    @Autowired
    private DefaultCustomLog defaultCustomLog;

    @Override
    public AvailableCurrencies[] getCurrencies() {

        defaultCustomLog.addLog("getCurrencies");

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/tables/C/", AvailableCurrencies[].class);

    }

    @Override
    public SingleCurrency getRates(String currencyCode) {

        defaultCustomLog.addParamLogShort(currencyCode);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/C/" + currencyCode + "/", SingleCurrency.class);
    }
}
