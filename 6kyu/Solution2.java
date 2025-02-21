//Bit Counting
public class Solution2
{
  public static void main (String[] args)
  {
      int zahl = 5;
      System.out.println(countBits(zahl));

  }

    public static int countBits(int n){

        int count = 0;
        String bits = "";
        while (n!=0)
        {
            bits+=String.valueOf(n%2);
            n/=2;
        }
        for (int i = 0; i < bits.length(); i++)
        {
            if (bits.charAt(i)=='1')
            {
                count+=1;
            }
        }
        return count;
    }
}
