//Isograms
import java.io.*;
import java.util.*;

public class Solution6
{
    public static void main (String[] args)
    {
        System.out.println(isIsogram("aba"));
    }

    public static boolean  isIsogram(String str)
    {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        if(str.isEmpty())
        {
            return true;
        }
        else
        {
            for (int i = 0; i < str.length()-1; i++)
            {
                if(arr[i]==arr[i+1])
                {
                    return false;
                }
            }
            return true;
        }
    }



}
