package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep12
{
    public static void main (String [] args)
    {
        int i;
        int j;
        int p = 0;
        for(i = 1; i <= 6; i++)
        {
            for(j = 1; j <= 6; j++)
            {
                if(i + j == 7)
                {
                    p++; 
                    System.out.println("Possibilidade " + p + ": " + i + " + " + j + " = 7.");
                }
            }
        }
    }
}
