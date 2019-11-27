package com.project.currencyconverter.controller;

import com.project.currencyconverter.model.CustomLog;
import com.project.currencyconverter.model.Params;
import com.project.currencyconverter.repository.CustomLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@Service
public class DefaultCustomLog {

    @Autowired
    private CustomLogRepository customLogRepository;

    public void addLog(String className) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        CustomLog customLog = new CustomLog(timeStamp, className);
        customLogRepository.save(customLog);
    }

    public void addParamLog(float amount, String from, String to){

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        Params params = new Params(String.valueOf(amount), from, to);
        List<Params> paramList = new ArrayList<Params>();
        paramList.add(params);
        CustomLog customLog = new CustomLog(
                timeStamp,
                "com.project.currencyconverter.controller.Calculate",
                paramList
        );
        customLogRepository.save(customLog);
    }
}
