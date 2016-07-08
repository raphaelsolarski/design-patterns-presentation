package strategy;

import org.junit.Test;
import strategy.strategies.TransferPayStrategy;

import java.math.BigDecimal;

public class PayServiceTest {

    @Test
    public void testPay() throws Exception {

        PayService payService = new PayService();
        payService.pay(BigDecimal.valueOf(15), new TransferPayStrategy());

    }
}