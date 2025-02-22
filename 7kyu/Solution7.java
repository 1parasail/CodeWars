//Simple string reversal
public class Solution7
{
    public static void main (String[] args)
    {
        System.out.println(solve("solution"));

    }

    public static String solve(String s)
    {
        String chars = s.replaceAll(" ", "");
        int backward = chars.length()-1;
        String res = "";

        for(int i = 0;i<s.length(); i++){
            if(s.charAt(i) == ' '){
                res += " ";
            }else{
                res += chars.charAt(backward);
                backward--;
            }
        }

        return res;

    }
}
