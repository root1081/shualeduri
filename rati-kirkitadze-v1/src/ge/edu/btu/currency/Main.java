package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main extends CurrencyServiceImpl{
    public static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        CurrencyService currencyService = new CurrencyServiceImpl();

        currencyService.setExchangeRate(3.12);

        int a = 9;
        double b = 9.36;

        int first = currencyService.convert(a);
        double second = currencyService.convert(b);

        logger.info("შედეგი 1 " + a);
        logger.info("შედეგი 2 " + b);

        System.out.println(first);
        System.out.println(second);
    }
}
