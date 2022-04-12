package StrategyWay;

import java.math.BigDecimal;

public class WeChatPay implements PaymentStrategy {
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("wechat" + amount);
    }
}
