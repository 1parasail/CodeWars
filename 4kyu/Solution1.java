import java.math.BigInteger;

//Large Factorials
public class Solution1
{
    public static void main (String[] args)
    {
        BigInteger bigInteger = new BigInteger("25");
        System.out.println(fact(bigInteger));

    }

    public static BigInteger fact(BigInteger n) {
        if (n.intValue() <= 1) {
            return BigInteger.valueOf(1);
        }
        else {
            return n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
        }
    }
    public static String Factorial(int n) {
        return fact(BigInteger.valueOf(n)).toString();
    }
}
