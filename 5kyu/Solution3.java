//Product of consecutive Fib numbers
public class Solution3
{
    public static void main (String[] args)
    {
        long prod = 800;

        long[] res = productFib(prod);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
    }

    public static long[] productFib(long prod) {
        long loFib = 0;
        long hiFib = 1;
        long[] ans = new long [3];
        while(loFib*hiFib<=prod)
        {
            if (loFib*hiFib==prod)
            {
                ans[0]=loFib;
                ans[1]=hiFib;
                ans[2]=1;
                return ans;
            }
            hiFib+=loFib;
            loFib=hiFib-loFib;
        }
        ans[0]=loFib;
        ans[1]=hiFib;
        ans[2]=0;
        return ans;
    }
}
