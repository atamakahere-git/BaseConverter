package com.atamaka;

public class Octal {
    long octal;

    public Octal(long octal) {
        this.octal = octal;
    }

    public Octal () {
        this.octal = 0;
    }

    public long getOctal() {
        return octal;
    }

    public void setOctal(long octal) {
        this.octal = octal;
    }

    public Decimal toDecimal (Octal octal) {
        Decimal decimal;
        int i = 0;
        long oct = octal.octal;
        long dec= 0;
        while (oct > 0) {
            dec += (oct%10)*Math.pow(8,i++);
            oct /= 10;
        }
        decimal = new Decimal(dec);
        return decimal;
    }

    public Decimal toDecimal() {
        return this.toDecimal(this);
    }

    public Binary toBinary (Octal octal) {
        Decimal decimal = octal.toDecimal();
        return decimal.toBinary();
    }

    public Binary toBinary () {
        return this.toBinary(this);
    }

    @Override
    public String toString() {
        return String.valueOf(this.octal);
    }
}
