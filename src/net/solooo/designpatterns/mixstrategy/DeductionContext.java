package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public class DeductionContext {
    private IDeduction deduction;

    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }

    /**
     *
     * @param card
     * @param trade
     * @return
     */
    public boolean exec(Card card, Trade trade) {

        return deduction.exec(card, trade);
    }
}
