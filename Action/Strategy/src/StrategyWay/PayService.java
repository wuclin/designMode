package StrategyWay;

import java.math.BigDecimal;

public class PayService {
    public void payment(PaymentStrategy strategy, BigDecimal amount){
        strategy.payment(amount);
    }
}
