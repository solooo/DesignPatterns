package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class DeductionFactory {

    public static IDeduction getDeduction(StrategyMan strategyMan) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(strategyMan.getValue()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return deduction;
    }
}
