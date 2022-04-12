package StrategyWay;

import java.math.BigDecimal;

public class CreditPay implements PaymentStrategy {
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("Credit" + amount);

    }
}
