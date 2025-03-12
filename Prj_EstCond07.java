package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond07 
{
    public static void main(String [] args)
    {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        
        if ((num % 2 == 0) && (num % 3 == 0))
        {
            JOptionPane.showMessageDialog(null, "É divisível.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não é divisível.");
        }
    }
}
