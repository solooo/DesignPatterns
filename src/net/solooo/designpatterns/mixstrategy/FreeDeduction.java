package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class FreeDeduction implements IDeduction {
    /**
     * 执行具体扣款方法
     *
     * @param card
     * @param trade
     * @return
     */
    @Override
    public boolean exec(Card card, Trade trade) {

        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
