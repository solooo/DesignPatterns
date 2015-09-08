package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class SteadyDeduction implements IDeduction {

    @Override
    public boolean exec(Card card, Trade trade) {
        int amount = (int) Math.rint(trade.getAmount() / 2.0);
        card.setSteadyMoney(card.getSteadyMoney() - amount);
        card.setFreeMoney(card.getFreeMoney() - amount);
        return true;
    }
}
