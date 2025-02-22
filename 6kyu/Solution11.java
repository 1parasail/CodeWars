//Find the unique number
import java.util.Arrays;
public class Solution11
{
    public static void main (String[] args)
    {
        double[] arr = {1,1,1,12,1,1,1};
        System.out.println(findUniq(arr));

    }

    public static double findUniq(double arr[])
    {
        Arrays.sort(arr);
        if(arr[0]!=arr[1])
        {
            return arr[0];
        } else
        {

            return arr[arr.length-1];}
    }

}
