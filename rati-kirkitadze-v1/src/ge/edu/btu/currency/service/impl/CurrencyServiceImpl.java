package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.Main;
import ge.edu.btu.currency.service.CurrencyService;
import org.apache.log4j.Logger;

public class CurrencyServiceImpl implements CurrencyService {
    double exchangeRate = setExchangeRate(3.12);

    @Override
    public double setExchangeRate(double exchangeRate) {
        return exchangeRate;
    }

    @Override
    public int convert(int amount) {
        return (int) (amount/exchangeRate);
    }

    @Override
    public double convert(double amount) {
        return amount/exchangeRate;
    }
}
