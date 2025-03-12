package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond05 
{
    public static void main(String [] args)
    {
        int n1;
        int n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        
        if (n1 >= n2)
        {
            JOptionPane.showMessageDialog(null, n2);
            JOptionPane.showMessageDialog(null, n1);
        }
        else if (n2 > n1)
        {
            JOptionPane.showMessageDialog(null, n1);
            JOptionPane.showMessageDialog(null, n2);
        }
    }
}
