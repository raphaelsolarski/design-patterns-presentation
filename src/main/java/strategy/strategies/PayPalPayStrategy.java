package strategy.strategies;

import strategy.PayStrategy;

import java.math.BigDecimal;

public class PayPalPayStrategy implements PayStrategy{
    @Override
    public void pay(BigDecimal cost) {
        //payPal pay logic
        System.out.println("payPal pay behaviour");
    }
}
