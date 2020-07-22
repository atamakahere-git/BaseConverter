import com.atamaka.*;

public class Main {
    public static void main(String[] args) {
        //Tests
        Decimal decimal = new Decimal();
        Octal octal = new Octal();
        Binary binary = new Binary();
        decimal.setDecimal(123);
        octal.setOctal(123);
        binary.setBinary(10110);
        System.out.println("Converting Decimal to octal and binary:\n" +
                decimal.toString() + " = " + decimal.toOctal().toString()+
                " = " + decimal.toBinary().toString());
        System.out.println("Converting Octal to decimal and binary:\n" +
                octal.toString() + " = " + octal.toDecimal().toString() +
                " = " + octal.toBinary().toString());
        System.out.println("Converting Binary to decimal and octal:\n" +
                binary.toString() + " = " + binary.toDecimal().toString() +
                " = " + binary.toOctal().toString());
    }
}
