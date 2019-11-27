package com.project.currencyconverter.service;

import com.project.currencyconverter.model.DTO.CalculateDTO;

/**
 * Calculate based on exchange rates from given currency to another given currency
 */
public interface CalculateService {

    /**
     * Calculates what the value will be of your currency in other currencies
     * @param amount - how much to exchange
     * @param from - from what currency
     * @param to - to what currency
     * @return - returns a result of calculations
     */
    CalculateDTO calculate(float amount, String from, String to);
}
