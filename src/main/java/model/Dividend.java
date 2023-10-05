package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dividend extends Ticker {

    @JsonProperty("cash_amount")
    public double cashAmount;

    @JsonProperty("currency")
    public String currency;

    @JsonProperty("declaration_date")
    public String declarationDate;

    @JsonProperty("dividend_type")
    public String dividendType;

    @JsonProperty("ex_dividend_date")
    public String exDividendDate;

    @JsonProperty("frequency")
    public int frequency;

    @JsonProperty("pay_date")
    public String payDate;

    @JsonProperty("record_date")
    public String recordDate;


    public Dividend() {
        // Default constructor
    }

    public Dividend(String ticker) {
        super(ticker);
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDeclarationDate() {
        return declarationDate;
    }

    public void setDeclarationDate(String declarationDate) {
        this.declarationDate = declarationDate;
    }

    public String getDividendType() {
        return dividendType;
    }

    public void setDividendType(String dividendType) {
        this.dividendType = dividendType;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
}
