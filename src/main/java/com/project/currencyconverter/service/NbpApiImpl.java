package com.project.currencyconverter.service;

import com.project.currencyconverter.model.AvailableCurrencies;
import com.project.currencyconverter.model.SingleCurrency;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpApiImpl implements NbpApi {
    @Override
    public AvailableCurrencies[] getCurrencies() {



        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/tables/C/", AvailableCurrencies[].class);

    }

    @Override
    public SingleCurrency getRates(String currencyCode) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/C/" + currencyCode + "/", SingleCurrency.class);
    }
}
