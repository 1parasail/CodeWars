import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//Find min and max
public class Solution1
{
    public static void main (String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        int[] res = getMinMax(list);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] getMinMax(List<Integer> list)
    {
        int min = list.get(0);
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            if(list.get(i) < min)
            {
                min = list.get(i);
            }
            if(list.get(i) > max)
            {
                max = list.get(i);
            }
        }
        return new int[]{min, max};
    }
}
