//Beginner Series #3 Sum of Numbers
public class Solution5
{
    public static void main (String[] args)
    {
        int a = 1;
        int b = 0;

        System.out.println(GetSum(a,b));

    }

    public static int GetSum(int a, int b)
    {
        int sum = 0;
        if (a==b)
        {
            return a;}
        else if (a>b)
        {
            for (int i = b; i <= a; i++)
            {
                sum+=i;
            }
            return sum;
        }
        else
        {
            for (int i = a; i <= b; i++)
            {
                sum+=i;
            }
            return sum;
        }
    }

}
