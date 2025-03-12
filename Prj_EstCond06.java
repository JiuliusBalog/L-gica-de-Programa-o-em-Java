package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond06 
{
    public static void main (String [] args)
    {
        int n1;
        int n2;
        int n3;
        int n4;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto valor: "));
        
        if ((n2 >= n1) && (n2 <= n3))
        {
            if (n3 > n2)
            {
                if (n4 < n1)
                {
                    JOptionPane.showMessageDialog(null, n4);
                    JOptionPane.showMessageDialog(null, n1);
                    JOptionPane.showMessageDialog(null, n2);
                    JOptionPane.showMessageDialog(null, n3);
                }
                else if ((n4 > n1) && (n4 < n2))
                {
                    JOptionPane.showMessageDialog(null, n1);
                    JOptionPane.showMessageDialog(null, n4);
                    JOptionPane.showMessageDialog(null, n2);
                    JOptionPane.showMessageDialog(null, n3);
                }
                else if ((n4 > n2) && (n4 < n3))
                {
                    JOptionPane.showMessageDialog(null, n1);
                    JOptionPane.showMessageDialog(null, n2);
                    JOptionPane.showMessageDialog(null, n4);
                    JOptionPane.showMessageDialog(null, n3);
                }
                else if (n4 > n3)
                {
                    JOptionPane.showMessageDialog(null, n1);
                    JOptionPane.showMessageDialog(null, n2);
                    JOptionPane.showMessageDialog(null, n3);
                    JOptionPane.showMessageDialog(null, n4);
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Fora de ordem, insira novamente.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Fora de ordem , insira novamente.");
        }
    }
}
