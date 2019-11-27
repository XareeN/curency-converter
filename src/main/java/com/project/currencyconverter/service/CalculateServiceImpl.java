package com.project.currencyconverter.service;

import com.project.currencyconverter.exception.ErrorCodes;
import com.project.currencyconverter.exception.InvalidOperation;
import com.project.currencyconverter.model.DTO.CalculateDTO;
import com.project.currencyconverter.model.SingleCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class CalculateServiceImpl implements CalculateService {

    @Autowired
    private NbpApi nbpApi;

    @Override
    public CalculateDTO calculate(float amount, String from, String to) {

        try{
            SingleCurrency exchangeFrom = nbpApi.getRates(from);
            SingleCurrency exchangeTo = nbpApi.getRates(to);

            float askFrom = exchangeFrom.getRates().get(0).getAsk();
            String nameFrom = exchangeFrom.getCode();

            float askTo = exchangeTo.getRates().get(0).getAsk();
            String nameTo = exchangeTo.getCode();

            float result = (askFrom / askTo) * amount;

            return new CalculateDTO(result);

        }catch(HttpClientErrorException.NotFound e){
            throw new InvalidOperation(ErrorCodes.UNEXPECTED_CURRENCY, "Watrość from: " + from + " bądź to: " + to + " jest nieprawidłowa");
        }

    }
}
