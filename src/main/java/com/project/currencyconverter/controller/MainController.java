package com.project.currencyconverter.controller;

import com.project.currencyconverter.model.AvailableCurrencies;
import com.project.currencyconverter.model.DTO.CalculateDTO;
import com.project.currencyconverter.service.CalculateService;
import com.project.currencyconverter.service.NbpApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @Autowired
    private CalculateService calculateService;

    @Autowired
    private NbpApi nbpApi;

    @Autowired
    private DefaultCustomLog defaultCustomLog;

    @GetMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculateDTO> calculateCurrency(
            @RequestParam(value = "amount") float amount,
            @RequestParam(value = "from") String from,
            @RequestParam(value = "to") String to){

        defaultCustomLog.addParamLog(amount, from, to);

        return ResponseEntity.ok(calculateService.calculate(amount, from, to));
    }

    @GetMapping(value = "/currencies", produces = MediaType.APPLICATION_JSON_VALUE)
    public AvailableCurrencies[] showCurrencies(){

        AvailableCurrencies[] availableCurrencies = nbpApi.getCurrencies();


        defaultCustomLog.addLog("com.project.currencyconverter.controller.Currencies");

        return availableCurrencies;
    }

}
