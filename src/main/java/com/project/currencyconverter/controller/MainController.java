package com.project.currencyconverter.controller;

import com.project.currencyconverter.model.DTO.AvailableCurrencies;
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


    @GetMapping(value = "/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculateDTO> calculateCurrency(
            @RequestParam(value = "amount") float amount,
            @RequestParam(value = "from") String from,
            @RequestParam(value = "to") String to){

        return ResponseEntity.ok(calculateService.calculate(amount, from, to));
    }

    @GetMapping(value = "/currencies", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AvailableCurrencies[]> showCurrencies(){

        AvailableCurrencies[] availableCurrencies = nbpApi.getCurrencies();

        return ResponseEntity.ok(availableCurrencies);
    }

}
