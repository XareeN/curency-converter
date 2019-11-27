package com.project.currencyconverter.model;

import com.project.currencyconverter.model.DTO.Params;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "logs")
public class CustomLog {

    @Id
    private String id;
    private String date;
    private String className;
    private List<Params> params;
    private String param;

    public CustomLog(String date, String className, List<Params> params) {
        this.date = date;
        this.className = className;
        this.params = params;
    }

    public CustomLog(String date, String className) {
        this.date = date;
        this.className = className;
    }

    public CustomLog(String date, String className, String param) {
        this.date = date;
        this.className = className;
        this.param = param;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Params> getParams() {
        return params;
    }

    public void setParams(List<Params> params) {
        this.params = params;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
