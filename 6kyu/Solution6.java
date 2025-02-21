//Break camelCase
public class Solution6
{
    public static void main (String[] args)
    {
        String input = "camelCasing";

        System.out.println(camelCase(input));

    }

    public static String camelCase(String input) {
        if (input.length()==0)
        {
            return "";
        }
        String result = "";
        char[] characters = input.toCharArray();

        for (int i = 0; i < input.length()-1; i++)
        {
            result = result + characters[i];
            if (Character.isUpperCase(characters[i+1]))
            {
                result = result + " ";
            }
        }
        result = result + characters[input.length()-1];
        return result;
    }

}
