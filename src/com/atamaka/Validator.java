package com.atamaka;

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
