package com.simon.actions;

import java.math.BigDecimal;

public class Actions {

    public Actions() {
    }

    public static BigDecimal division(BigDecimal first, BigDecimal second) {
        return first.divide(second);
    }

    public static BigDecimal multiplication(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }

    public static BigDecimal addition(BigDecimal first, BigDecimal second) {
        return first.add(second);
    }

    public static BigDecimal subtraction(BigDecimal first, BigDecimal second) {
        return first.subtract(second);
    }

    public static BigDecimal remainder(BigDecimal first, BigDecimal second) {
        return first.remainder(second);
    }


}
