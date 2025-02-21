//Number of trailing zeros of N!
public class Solution2
{
    public static void main (String[] args)
    {
        int n = 12;

        System.out.println(zeros(n));

    }

    public static int zeros(int n) {
        if (n<0)
        {
            return 0;
        }
        else
        {
            int count = 0;
            for (int i = 5; n/i>=1; i*=5)
            {
                count+=n/i;
            }
            return count;
        }
    }
}
