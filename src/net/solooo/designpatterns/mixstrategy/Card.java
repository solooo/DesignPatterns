package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class Card {

    private int cardNo = 0;

    private int steadyMoney = 0;

    private int freeMoney = 0;

    public Card() {
    }

    public Card(int cardNo, int steadyMoney, int freeMoney) {
        this.cardNo = cardNo;
        this.steadyMoney = steadyMoney;
        this.freeMoney = freeMoney;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}
