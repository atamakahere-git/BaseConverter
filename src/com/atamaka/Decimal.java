package com.atamaka;
/*
    Author : M. Tanveer Raza
    Date : July 22, 2020
    Last Edit: July 24 2020
    Class : Decimal
    Desc: Decimal class is used to create an object to store and modify decimal number.
    Data members:
        1. long decimal : to store decimal value
    Methods:
        1. Decimal(long decimal) : constructor with argument to initialize decimal with given value.
        2. Decimal() : constructor with no argument to initialize decimal with zero value.
        3. Getters and Setters for decimal data member
        4. Binary toBinary(Decimal decimal) : returns a Binary object equivalent to Decimal object passed as parameter.
        5. Binary toBinary() : returns a Binary object equivalent to Decimal object from which it is being called.
        6. Octal toOctal (Decimal decimal) : returns an Octal object equivalent to Decimal object passed as parameter.
        7. Octal toOctal () : returns a Octal object equivalent to Decimal object from which it is being called.
        8. String toString() : Overrides toString method, returns the decimal value with respective base. Ex. 69(10).
    Usage:
        1. Decimal decimal = new Decimal(decimal_value);
        2. Binary binary = new Binary(); binary = Decimal.toBinary(69);
        3. decimal.toString() : Outputs : 69(10)
 */
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
        return this.decimal + "(10)";
    }
}
