//Point in the Circle
public class Solution4
{
    public static void main (String[] args)
    {
        int rad = 2;
        System.out.println(pointsNumber(rad));

    }

    public static int pointsNumber(int radius)
    {
        int points = 0;
        double rDist = radius;
        for(int i = radius*(-1); i <= radius; i++)
        {
            for(int j = radius*(-1); j <= radius; j++)
            {
                if(distance(i, j, 0, 0) <= rDist)
                    points+=1;
            }
        }
        return points;
    }


    public static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt( ((x2-x1) * (x2-x1))+( (y2-y1) * (y2-y1)));
    }
}
