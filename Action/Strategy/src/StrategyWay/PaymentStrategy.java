package StrategyWay;

import java.math.BigDecimal;

public interface PaymentStrategy {
    public void payment(BigDecimal amount);
}
