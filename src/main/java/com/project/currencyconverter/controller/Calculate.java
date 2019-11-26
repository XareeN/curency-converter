package com.project.currencyconverter.controller;

import com.project.currencyconverter.model.CurrencyRate;
import com.project.currencyconverter.model.SingleCurrency;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/calculate")
public class Calculate {

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String calculateCurrency(
            @RequestParam(value = "from", defaultValue = "USD") String from,
            @RequestParam(value = "to", required = false, defaultValue = "EUR") String to,
            @RequestParam(value = "amount", defaultValue = "10") String amount){

        RestTemplate restTemplate = new RestTemplate();
        SingleCurrency exchangeFrom = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/C/" + from + "/", SingleCurrency.class);
        SingleCurrency exchangeTo = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/C/" + to + "/", SingleCurrency.class);

        float askFrom = exchangeFrom.getRates().get(0).getAsk();
        String nameFrom = exchangeFrom.getCode();

        float askTo = exchangeTo.getRates().get(0).getAsk();
        String nameTo = exchangeTo.getCode();

        float result = askFrom / askTo;
        float result2 = result * Float.parseFloat(amount);

        return (
            "1 " + nameFrom + ", to " + result + " " + nameTo
            + "\n, czyli posiadasz: " + result2 + " " + nameTo
        );
    }
}
