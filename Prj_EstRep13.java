package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep13 
{
    public static void main (String [] args)
    {
        double serie = 1;
        double i = 1;
        double j = 1;
        
        JOptionPane.showMessageDialog(null, "Série " + i + " = " + serie);
        while (i < 50 && j < 99)
        {
            i = i + 1;
            j = j + 2;
            serie = serie + (i/j);
            JOptionPane.showMessageDialog(null, "Série " + i + " / " + j + " = " + serie);
        }
    }
}
