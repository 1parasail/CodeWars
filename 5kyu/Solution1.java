//Tricky Min-Max
public class Solution1
{
    public static void main (String[] args)
    {
        int a = 2;
        int b = 1;
        char symbol = '>';

        System.out.println(solve(a, b, symbol));

    }

    public static int solve(int a, int b, char symbol)
    {
        return a + (b - a & (b - a ^ symbol << 30) >> 31);
    }
}
