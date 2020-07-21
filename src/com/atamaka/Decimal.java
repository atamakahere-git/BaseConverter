package com.atamaka;

public class Decimal {
    private long decimal;

    public Decimal(long decimal) {
        this.decimal = decimal;
    }

    public Decimal() {
        this.decimal = 0;
    }

    public long getDecimal() {
        return decimal;
    }

    public void setDecimal(long decimal) {
        this.decimal = decimal;
    }

    public Binary toBinary(Decimal decimal) {
        Binary binary;
        long dec = decimal.getDecimal();
        long bin = 0;
        byte[] data = new byte[20];
        int i = 0;
        while (dec>0) {
            data[i++] = (byte) (dec%2);
            dec/=2;
        }
        while (i>=0) {
            bin += data[i]*Math.pow(10,i);
            i--;
        }
        binary = new Binary(bin);
        return binary;
    }

    public Binary toBinary() {
        return  this.toBinary(this);
    }

    public Octal toOctal (Decimal decimal) {
        Octal octal;
        long dec = decimal.getDecimal();
        long oct = 0;
        byte[] data = new byte[20];
        int i = 0;
        while (dec>0) {
            data[i++] = (byte) (dec%8);
            dec/=8;
        }
        while (i>=0) {
            oct += data[i]*Math.pow(10,i);
            i--;
        }
        octal = new Octal(oct);
        return octal;
    }

    public Octal toOctal () {
        return this.toOctal(this);
    }

    @Override
    public String toString() {
        return String.valueOf(this.decimal);
    }
}
