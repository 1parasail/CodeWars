//Quadrants
public class Solution1
{
    public static void main (String[] args)
    {
        int x = 19;
        int y = -56;
        System.out.println(quadrant(x,y));

    }

    public static int quadrant(int x, int y) {
        if (x>0 && y >0)
        {
            return 1;
        }
        else if (x<0 && y>0)
        {
            return 2;
        }
        else if (x<0 && y< 0)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }


}
