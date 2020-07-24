package com.atamaka;
/*
    Author : M. Tanveer Raza
    Date : July 22, 2020
    Last Edit: July 24 2020
    Class : Validator
    Desc: Validator is used to check whether the long data member is valid for Binary or Octal instantiation.
    Data members: null
    Methods:
        1. boolean validate : checks whether the instantiated object is valid or not, returns true if it is valid.
        2. isBinary () : checks whether long value is valid binary or not, returns boolean if it is valid.
        3. isOctal () : checks whether long value is valid octal or not, returns boolean if it is valid.
        4. isDecimal () : does nothing, just to create balance for decimal value.
    Usage:
        1. if ( Validator.validate( (Binary) binary) ) {true block}
        2. if ( Validator.isBinary( (long) bin_value) ) {true block}
 */
public class Validator {
    public static boolean validate(Decimal decimal) {
        return true;
    }
    public static boolean validate (Binary binary) {
        long bin = binary.getBinary();
        while (bin > 0) {
            if (!(bin%10 == 0 || bin%10 == 1))
                return false;
            bin/=10;
        }
        return true;
    }
    public static boolean validate (Octal octal) {
        long oct = octal.getOctal();
        while (oct > 0) {
            if (oct%10 == 8 || oct%10 == 9)
                return false;
            oct/=10;
        }
        return true;
    }
    public static boolean isBinary (long bin) {
        while (bin > 0) {
            if (!(bin%10 == 0 || bin%10 == 1))
                return false;
            bin/=10;
        }
        return true;
    }
    public static boolean isOctal (long oct) {
        while (oct > 0) {
            if (oct%10 == 8 || oct%10 == 9)
                return false;
            oct/=10;
        }
        return true;
    }
    public static boolean isDecimal (long dec) {
        return true;
    }
}
