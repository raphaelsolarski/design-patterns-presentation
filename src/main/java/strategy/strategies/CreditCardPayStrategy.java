package strategy.strategies;

import strategy.PayStrategy;

import java.math.BigDecimal;

public class CreditCardPayStrategy implements PayStrategy {
    @Override
    public void pay(BigDecimal cost) {
        System.out.println("Credit card pay behaviour");
    }
}
