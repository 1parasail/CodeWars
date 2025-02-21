//Two Sum
public class Solution3
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,3};
        int target = 4;
        int[] res = twoSum(arr, target);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] twoSum(int[] numbers, int target)
    {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length - 1; i++)
            {
                for (int j = i + 1; j < numbers.length; j++)
                {
                    if ((target - numbers[i]) == numbers[j])
                    {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
        return result;
    }
}
