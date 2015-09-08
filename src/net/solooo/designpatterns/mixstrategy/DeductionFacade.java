package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class DeductionFacade {

    public static Card deduct(Card card, Trade trade) {
        StrategyMan strategyMan = getDeductionType(trade);
        IDeduction deduction = DeductionFactory.getDeduction(strategyMan);
        deduction.exec(card, trade);

        return card;
    }

    private static StrategyMan getDeductionType(Trade trade) {
        switch (trade.getTradeNo()) {
            case "001":
                return StrategyMan.FreeDeduction;
            case "002":
                return StrategyMan.SteadyDeduction;
            default:
                return null;
        }
    }
}
