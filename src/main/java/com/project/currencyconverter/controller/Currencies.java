package com.project.currencyconverter.controller;

import com.project.currencyconverter.model.AvailableCurrencies;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Currencies {

    @GetMapping(value = "/currencies", produces = MediaType.APPLICATION_JSON_VALUE)
    public AvailableCurrencies[] showCurrencies(){

        RestTemplate restTemplate = new RestTemplate();
        AvailableCurrencies[] availableCurrencies = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/tables/C/", AvailableCurrencies[].class);


        return availableCurrencies;
    }

}
