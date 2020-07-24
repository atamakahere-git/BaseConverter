package com.atamaka;
/*
    Author : M. Tanveer Raza
    Date : July 22, 2020
    Last Edit: July 24 2020
    Class : Binary
    Desc: Binary class is used to create an object to store and modify binary number.
    Data members:
        1. long binary : to store binary value
    Methods:
        1. Binary(long binary) : constructor with argument to initialize binary with given value.
        2. Binary() : constructor with no argument to initialize binary with zero value.
        3. Getters and Setters for binary data member
        4. Decimal toDecimal(Binary binary) : return a Decimal object equivalent to Binary object passed as parameter.
        5. Decimal toDecimal() : returns a Decimal object equivalent to Binary object from which it is being called.
        6. Octal toOctal (Binary binary) : return a Octal object equivalent to Binary object passed as parameter.
        7. Octal toOctal () : returns a Octal object equivalent to Binary object from which it is being called.
        8. String toString() : Overrides toString method, returns the binary value with respective base. Ex. 10101(2).
    Usage:
        1. Binary binary = new Binary(bin_value);
        2. Decimal decimal = new Decimal(); decimal = Binary.toDecimal(101001);
        3. binary.toString() : Outputs : 101001(2)
 */
public class Binary {
    private long binary;
    public Binary (long binary) {
        if (Validator.isBinary(binary))
            this.binary = binary;
        else {
            System.out.println("Invalid binary number! Binary created with initial value 0");
            this.binary=0;
        }
    }
    public Binary () {
        this.binary = 0;
    }
    public long getBinary() {
        return binary;
    }
    public void setBinary(long binary) {
        if (Validator.isBinary(binary))
            this.binary = binary;
        else System.out.println("Invalid binary number, Binary not set!");
    }
    public static Decimal toDecimal (Binary binary) {
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
        return Binary.toDecimal(this);
    }
    public static Octal toOctal (Binary binary) {
        return binary.toDecimal().toOctal();
    }
    public Octal toOctal () {
        return Binary.toOctal(this);
    }
    @Override
    public String toString() {
        return this.binary + "(2)";
    }
}
