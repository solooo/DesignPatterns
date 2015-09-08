package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class Trade {

    private String tradeNo = "";

    private int amount = 0;

    public Trade() {
    }

    public Trade(String tradeNo, int amount) {
        this.tradeNo = tradeNo;
        this.amount = amount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
