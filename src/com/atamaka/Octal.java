package com.atamaka;

public class Octal {
    private long octal;
    public Octal(long octal) {
        if (Validator.isOctal(octal))
            this.octal = octal;
        else {
            System.out.println("Invalid octal number! Octal created with initial value 0");
            this.octal=0;
        }
    }
    public Octal () {
        this.octal = 0;
    }
    public long getOctal() {
        return octal;
    }
    public void setOctal(long octal) {
        if (Validator.isOctal(octal))
            this.octal = octal;
        else System.out.println("Invalid octal number, Octal not set!");
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
        return this.octal + "(8)";
    }
}
