package model;

public class Ticker {

    private String ticker;

    public Ticker(){}

    public Ticker(String ticker){
        this.ticker = ticker;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
