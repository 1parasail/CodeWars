//Highest and Lowest
public class Solution8
{
    public static void main (String[] args)
    {
        System.out.println(highAndLow("1 2 3 4"));
    }

    public static String highAndLow(String numbers)
    {
        String strArray[] = numbers.split(" ");
        int intArray_size = strArray.length;
        int intArray[] = new int[intArray_size];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }
        int highest = intArray[0];
        int lowest = intArray[0];
        for (int j = 1; j < intArray.length; j++) {
            if (intArray[j] > highest) {
                highest = intArray[j];
            }
            if (intArray[j] < lowest) {
                lowest = intArray[j]; }
        }
        return String.valueOf(highest) + " " + String.valueOf(lowest);
    }
}
