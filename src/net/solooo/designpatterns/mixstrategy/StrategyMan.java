package net.solooo.designpatterns.mixstrategy;

/**
 * Created by Eric on 2015/9/7.
 */
public enum StrategyMan {
    SteadyDeduction("SteadyDeduction"),
    FreeDeduction("FreeDeduction");

    String value = "";

    private StrategyMan(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return value;
    }
}
