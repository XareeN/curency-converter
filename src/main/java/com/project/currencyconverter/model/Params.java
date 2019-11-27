package com.project.currencyconverter.model;

public class Params {
    private String amount;
    private String from;
    private String to;

    public Params(String amount, String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
