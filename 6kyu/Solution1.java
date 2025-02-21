//Find the missing term in an Arithmetic Progression
public class Solution1
{
   public static void main (String[] args)
   {
       int[] arr = {1,3,5,9,11};
       System.out.println(findMissingElement(arr));

   }

    public static int findMissingElement(int[] numbers)
    {

        int n = numbers.length + 1;
        int sumOfElements = (n * (numbers[0] + numbers[numbers.length - 1])) / 2;
        int givenSum = 0;

        for (int num : numbers) {
            givenSum += num;
        }

        return sumOfElements - givenSum;
    }
}
