//Is a number prime?
public class Solution10
{
    public static void main (String[] args)
    {
        int number = 3;
        System.out.println(isPrime(number));

    }

    public static boolean isPrime(int num)
    {
        if (num < 2) {
            return false;
        } else {
            int nSquared = (int)Math.sqrt(num) + 1;
            for (int i = 2; i < nSquared; i++){
                if (num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
