package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep04 
{
    public static void main (String [] args)
    {
        double n;
        double seq;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número: "));
        seq = 0;
        
        for (double i = 1; i < n; i++)
        {
            seq = 1/i + seq;
            JOptionPane.showMessageDialog(null, "Sequência " + i + " = " + seq);
        }
    }
}
