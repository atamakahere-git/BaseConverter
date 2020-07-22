package com.atamaka;

public class Binary {
    private long binary;

    public long getBinary() {
        return binary;
    }

    public void setBinary(long binary) {
        this.binary = binary;
    }

    public Binary (long binary) {
        this.binary = binary;
    }

    public Binary () {
        this.binary = 0;
    }

    public Decimal toDecimal (Binary binary) {
        long bin = binary.binary;
        long d =  0;
        Decimal dec ;
        int i=0;
        while (bin > 0) {
            d += Math.pow(2,i++)*(bin%10);
            bin/=10;
        }
        dec = new Decimal(d);
        return dec;
    }

    public Decimal toDecimal() {
        return this.toDecimal(this);
    }

    public Octal toOctal (Binary binary) {
        return binary.toDecimal().toOctal();
    }

    public Octal toOctal () {
        return this.toOctal(this);
    }

    @Override
    public String toString() {
        return this.binary + "(2)";
    }
}
