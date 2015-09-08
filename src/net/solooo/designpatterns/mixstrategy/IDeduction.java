package net.solooo.designpatterns.mixstrategy;

/**
 * 扣款策略
 * Created by Eric on 2015/9/7.
 */
public interface IDeduction {

    /**
     * 执行具体扣款方法
     * @param card
     * @param trade
     * @return
     */
    public boolean exec(Card card, Trade trade);
}
