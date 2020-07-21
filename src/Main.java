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
                decimal.toString() + "(10)" + " = " + decimal.toOctal().toString() + "(8)" +
                " = " + decimal.toBinary().toString() + "(2)");
        System.out.println("Converting Octal to decimal and binary:\n" +
                octal.toString() + "(8)" + " = " + octal.toDecimal().toString() + "(10)" +
                " = " + octal.toBinary().toString() + "(2)");
        System.out.println("Converting Binary to decimal and octal:\n" +
                binary.toString() + "(2)" + " = " + binary.toDecimal().toString() + "(10)" +
                " = " + binary.toOctal().toString() + "(8)");
    }
}
