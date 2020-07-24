package com.atamaka.opertions;

import com.atamaka.*;
/*
    #Under Development
    Date : July 24, 2020
 */
public class Sum {

    public static Decimal getDecimalSum(Decimal decimal1, Decimal decimal2) {
        return new Decimal(decimal1.getDecimal()+decimal2.getDecimal());
    }
    public static Binary getBinarySum (Binary binary1, Binary binary2) {
        return new Decimal(binary1.toDecimal().getDecimal()+binary2.toDecimal().getDecimal()).toBinary();
    }
    public static Octal getOctalSum(Octal octal1, Octal octal2) {
        return new Decimal(octal1.toDecimal().getDecimal()+octal2.toDecimal().getDecimal()).toOctal();
    }
}
