package com.project.currencyconverter.controller;

import com.project.currencyconverter.model.CustomLog;
import com.project.currencyconverter.repository.CustomLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@Service
public class DefaultCustomLog {

    @Autowired
    private CustomLogRepository customLogRepository;

    public void addLog(String className) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        CustomLog customLog = new CustomLog(timeStamp, className);
        customLogRepository.save(customLog);
    }

    public void addParamLogShort(String param){

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        CustomLog customLog = new CustomLog(
                timeStamp,
                "addParamLogShort",
                param
        );
        customLogRepository.save(customLog);
    }
}
