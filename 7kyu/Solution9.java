//Averages of numbers
public class Solution9
{
    public static void main (String[] args)
    {
        int[] numbers = {1,2,3,4,5};
        double[] res = averages(numbers);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i]+" ");
        }


    }

    public static double[] averages(int[] numbers)
    {
        if (numbers == null)
        {
            return new double[0];
        }
        else if (numbers.length==0 || numbers.length==1)
        {
            return new double[0];
        }
        else {
            double[] arr = new double [numbers.length-1];
            double sum = 0;
            for (int i = 0; i < numbers.length-1; i++)
            {
                sum = numbers[i]+numbers[i+1];
                arr[i]=sum/2;
            }
            return arr;
        }
    }
}
