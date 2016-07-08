package strategy;

import java.math.BigDecimal;

public class PayService {

    public void pay(BigDecimal cost, PayStrategy payStrategy) {
        // some constant activities...

        // Now class PayService has to know implementation details of pay logic.
        // That has to know all variants of payMethods.

        payStrategy.pay(cost);

        // some constant activities...

    }

}
