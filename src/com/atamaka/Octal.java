package com.atamaka;
/*
    Author : M. Tanveer Raza
    Date : July 22, 2020
    Last Edit: July 24 2020
    Class : Octal
    Desc: Octal class is used to create an object to store and modify octal number.
    Data members:
        1. long octal : to store octal value
    Methods:
        1. Octal (long octal) : constructor with argument to initialize octal with given value.
        2. Octal () : constructor with no argument to initialize octal with zero value.
        3. Getters and Setters for octal data member
        4. Binary toBinary(Octal octal) : returns a Binary object equivalent to Octal object passed as parameter.
        5. Binary toBinary() : returns a Binary object equivalent to Octal object from which it is being called.
        6. Decimal toDecimal(Octal octal) : returns an Decimal object equivalent to Octal object passed as parameter.
        7. Decimal toDecimal () : returns a Decimal object equivalent to Octal object from which it is being called.
        8. String toString() : Overrides toString method, returns the octal value with respective base. Ex. 420(8).
    Usage:
        1. Octal octal = new Octal(octal_value);
        2. Decimal decimal = new Decimal(); decimal = Octal.toDecimal(420);
        3. octal.toString() : Outputs : 420(8)
 */
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
