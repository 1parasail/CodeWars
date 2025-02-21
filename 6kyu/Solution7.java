//Tribonacci Sequence
public class Solution7
{
    public static void main (String[] args)
    {
        double[] s = {1,1,1};
        int n = 7;

        double[] res = tribonacci(s,n);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i]+" ");
        }

    }

    public static double[] tribonacci(double[] s, int n) {
        double[] res = new double[n];
        for (int i = 0; i < s.length && i < n; i++)
        {
            res[i]=s[i];
        }

        for (int j = s.length; j < n; j++)
        {
            res[j]=res[j-1]+res[j-2]+res[j-3];
        }
        return res;
    }
}
