import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        String s="9";
        String s2="8";
        BigInteger m= new BigInteger(s2).multiply(new BigInteger(s2));
        System.out.println(m);

    }
}
