//package com.project.currencyconverter.controller;
//
//import com.project.currencyconverter.model.AvailableCurrencies;
//import com.project.currencyconverter.model.CustomLog;
//import com.project.currencyconverter.repository.CustomLogRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Calendar;
//
//@RestController
//public class Currencies {
//
//    @Autowired
//    private CustomLogRepository customLogRepository;
//
//    @GetMapping(value = "/currencies", produces = MediaType.APPLICATION_JSON_VALUE)
//    public AvailableCurrencies[] showCurrencies(){
//
//        RestTemplate restTemplate = new RestTemplate();
//        AvailableCurrencies[] availableCurrencies = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/tables/C/", AvailableCurrencies[].class);
//
//
//        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
//        CustomLog customLog = new CustomLog(timeStamp, "com.project.currencyconverter.controller.Currencies");
//        customLogRepository.save(customLog);
//
////        DefaultCustomLog defaultCustomLog = new DefaultCustomLog();
////        defaultCustomLog.addLog("com.project.currencyconverter.controller.Currencies");
//
//        return availableCurrencies;
//    }
//
//}
