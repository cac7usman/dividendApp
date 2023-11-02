package dao;

import model.Ticker;

import java.util.ArrayList;
import java.util.List;

public interface TickerDAO {

    void createTicker(Ticker ticker);
    void createTickers(List<Ticker> tickers);
    Ticker getTicker(Ticker ticker);
    ArrayList<Ticker> getTickers();
    void updateTicker(Ticker ticker);
    void deleteTicker(Ticker ticker);
}

