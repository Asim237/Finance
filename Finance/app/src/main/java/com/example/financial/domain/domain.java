package com.example.financial.domain;

import java.util.ArrayList;

public class domain {
    private String nameTxt;

    private String symbol;
    private Double priceTxt;
    private Double changePercentTxt;
    private Double propertySizeTxt;
    private Double propertyAmountTxt;
    private ArrayList<Integer> lineData;

    public String getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(String nameTxt) {
        this.nameTxt = nameTxt;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPriceTxt() {
        return priceTxt;
    }

    public void setPriceTxt(Double priceTxt) {
        this.priceTxt = priceTxt;
    }

    public Double getChangePercentTxt() {
        return changePercentTxt;
    }

    public void setChangePercentTxt(Double changePercentTxt) {
        this.changePercentTxt = changePercentTxt;
    }

    public Double getPropertySizeTxt() {
        return propertySizeTxt;
    }

    public void setPropertySizeTxt(Double propertySizeTxt) {
        this.propertySizeTxt = propertySizeTxt;
    }

    public Double getPropertyAmountTxt() {
        return propertyAmountTxt;
    }

    public void setPropertyAmountTxt(Double propertyAmountTxt) {
        this.propertyAmountTxt = propertyAmountTxt;
    }

    public ArrayList<Integer> getLineData() {
        return lineData;
    }

    public void setLineData(ArrayList<Integer> lineData) {
        this.lineData = lineData;
    }

    public domain(String nameTxt, String symbol, Double priceTxt, Double changePercentTxt, Double propertySizeTxt, Double propertyAmountTxt, ArrayList<Integer> lineData) {
        this.nameTxt = nameTxt;
        this.symbol = symbol;
        this.priceTxt = priceTxt;
        this.changePercentTxt = changePercentTxt;
        this.propertySizeTxt = propertySizeTxt;
        this.propertyAmountTxt = propertyAmountTxt;
        this.lineData = lineData;
    }
}
