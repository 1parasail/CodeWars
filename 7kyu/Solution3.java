//Double Every Other
public class Solution3
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4};

        int[] res = doubleEveryOther(arr);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i]+" ");
        }

    }

    public static int[] doubleEveryOther(int[] a)
    {
        int[] b = new int[a.length];
        for (int i =0; i < b.length; i++)
        {
            if (i%2!=0)
            {
                b[i]=2*a[i];
            }
            else
            {
                b[i]=a[i];
            }
        }
        return b;
    }

}
