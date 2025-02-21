//Is this a triangle?
public class Solution2
{
    public static void main (String[] args)
    {
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println(isTriangle(a, b, c));

    }

    public static boolean isTriangle(int a, int b, int c)
    {
        if (a+b>c && b+c>a && a+c>b)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
