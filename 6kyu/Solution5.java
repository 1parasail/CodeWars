//Simple card game
public class Solution5
{
    public static void main (String[] args)
    {
        String[] steve = {"A","7","8"};
        String[] josh = {"K","5","9"};

        System.out.println(winner(steve, josh));

    }

    public static String winner(String[] deckSteve, String[] deckJosh) {
        for (int i = 0; i < deckSteve.length; i++)
        {
            if (deckSteve[i].equals("A"))
            {
                deckSteve[i]=deckSteve[i].replace("A", "14");
            }
            else if (deckSteve[i].equals("K"))
            {
                deckSteve[i]=deckSteve[i].replace("K", "13");
            }
            else if (deckSteve[i].equals("Q"))
            {
                deckSteve[i]=deckSteve[i].replace("Q", "12");
            }
            else if (deckSteve[i].equals("J"))
            {
                deckSteve[i]=deckSteve[i].replace("J", "11");
            }
            else if (deckSteve[i].equals("T"))
            {
                deckSteve[i]=deckSteve[i].replace("T", "10");
            }
        }

        for (int i = 0; i < deckJosh.length; i++)
        {
            if (deckJosh[i].equals("A"))
            {
                deckJosh[i]=deckJosh[i].replace("A", "14");
            }
            else if (deckJosh[i].equals("K"))
            {
                deckJosh[i]=deckJosh[i].replace("K", "13");
            }
            else if (deckJosh[i].equals("Q"))
            {
                deckJosh[i]=deckJosh[i].replace("Q", "12");
            }
            else if (deckJosh[i].equals("J"))
            {
                deckJosh[i]=deckJosh[i].replace("J", "11");
            }
            else if (deckJosh[i].equals("T"))
            {
                deckJosh[i]=deckJosh[i].replace("T", "10");
            }
        }

        int score1 = 0;
        int score2 = 0;

        for (int i =0; i < deckSteve.length; i++)
        {
            if(Integer.valueOf(deckSteve[i])>Integer.valueOf(deckJosh[i]))
            {
                score1+=1;
            }
            else if (Integer.valueOf(deckSteve[i])<Integer.valueOf(deckJosh[i]))
            {
                score2+=1;
            }
            else
            {
                score1+=0;
                score2+=0;
            }
        }

        if (score1>score2)
        {
            return "Steve wins"+" "+String.valueOf(score1)+" "+"to"+" "+String.valueOf(score2);
        }
        else if (score1<score2)
        {
            return "Josh wins"+" "+String.valueOf(score2)+" "+"to"+" "+String.valueOf(score1);
        }
        else
        {
            return "Tie";
        }

    }
}
