package StrategyWay;

import java.math.BigDecimal;

public class AliPay implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("ali" + amount);
    }
}
