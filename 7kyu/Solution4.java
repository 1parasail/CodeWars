//Regex validate PIN code
public class Solution4
{
    public static void main (String[] args)
    {
        String pin = "1234";
        System.out.println(validatePin(pin));

    }

    public static boolean validatePin(String pin) {
        String[] arr = pin.split("");
        String[] nums = {"1","2","3","4","5","6","7","8","9","0"};
        boolean[] bool = new boolean[arr.length];
        if (pin.length()!=6 && pin.length()!=4)
        {
            return false;
        }
        else
        {
            for (int i = 0 ; i< arr.length; i++)
            {
                for(int j = 0; j < nums.length; j++)
                {
                    if(arr[i].equals(nums[j]))
                    {
                        bool[i]=true;
                    }
                }
            }

            for (int i = 0; i < bool.length; i++)
            {
                if(bool[i]==false)
                {
                    return false;
                }
            }
            return true;
        }
    }


}
