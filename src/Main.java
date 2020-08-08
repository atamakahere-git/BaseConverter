import com.atamaka.*;

public class Main {
    public static void main(String[] args) {
        Decimal decimal = new Decimal(1906);
        Octal octal = new Octal(2765);
        Binary binary = new Binary(1101);
        System.out.println(binary.toString());
    }
}
