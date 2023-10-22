package dao;

import model.Dividend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface DividendDAO{

    void createDividend(Dividend dividend);
    void createDividends(List<Dividend> dividends) throws IOException;
    Dividend get(Dividend dividend);
    ArrayList<Dividend> getDividends();
    void update(Dividend dividend);
    void delete(Dividend dividend);
}
