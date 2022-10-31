import java.math.BigDecimal;
import java.math.BigInteger;

public class bigNumbers {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;

        System.out.println(a -b);

        BigDecimal bigD1 = BigDecimal.valueOf(0.7);
        BigDecimal bigD2 = BigDecimal.valueOf(0.3);
        BigDecimal res = bigD1.subtract(bigD2);
        System.out.println(res);


        BigInteger big1 = new BigInteger("999999999999999999999999999999999999999999999999");
        BigInteger big2 = new BigInteger("55555555555555555555");
        BigInteger result = big1.add(big2);
        System.out.println(result);

        double pow = Math.pow(9,2);

        double sqrt = Math.sqrt(9);
    
    }
}
