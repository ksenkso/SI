package ru.orthlus.si;

import java.math.BigDecimal;

public abstract class AbstractMeasure {
    private double value;
    private Prefix prefix;
    public double IN_KILOGRAMS;

    public double getValue() {
        return prefix.valuePowerByPrefix(this.value);
    }
    public double get_IN_KILOGRAMS(){
        return IN_KILOGRAMS;
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public AbstractMeasure(double value) {
        this.value = value;
        this.prefix = Prefix.NonePrefix;
    }

    public AbstractMeasure(double value, Prefix prefix) {
        this.value = value;
        this.prefix = prefix;
    }

}
