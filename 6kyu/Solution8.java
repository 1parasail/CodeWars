//Take a Ten Minutes Walk
public class Solution8
{
    public static void main (String[] args)
    {
        char[] directions = {'n','s','e', 'w'};
        System.out.println(isValid(directions));

    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int x = 0;
        int y = 0;

        for (Character c : walk) {
            switch (c) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x--;
                    break;
                case 'w':
                    x++;
                    break;
                default :
                    break;
            }
        }

        return x == 0 && y == 0;
    }

}
