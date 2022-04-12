package StrategyWay;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args){
        PayService payService = new PayService();
        payService.payment(new CreditPay(), new BigDecimal(100));
    }
}
