package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep14 
{
    public static void main (String [] args)
    {
        int anos;
        double ana;
        double maria;
        
        anos = 0;
        ana = 1.10;
        maria = 1.50;
        
        while (ana < maria)
        {
            ana = ana + 0.03;
            maria = maria + 0.02;
            anos = anos + 1;
            System.out.println("Altura de Ana: " + ana + " || Altura de Maria: " + maria + " || Anos: " + anos);
        }
    }
}
