package strategy.strategies;

import strategy.PayStrategy;

import java.math.BigDecimal;

public class TransferPayStrategy implements PayStrategy {
    @Override
    public void pay(BigDecimal cost) {
        System.out.println("Transfer pay behaviour");
    }
}
