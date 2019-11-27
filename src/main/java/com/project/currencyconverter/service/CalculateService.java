package com.project.currencyconverter.service;

import com.project.currencyconverter.model.DTO.CalculateDTO;

public interface CalculateService {

    CalculateDTO calculate(float amount, String from, String to);
}
