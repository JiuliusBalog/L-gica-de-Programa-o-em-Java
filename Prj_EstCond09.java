package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond09 
{
    public static void main(String [] args)
    {
        double num1;
        double num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        if (num1 > num2)
        {
            if (num1 % num2 == 0)
            {
                JOptionPane.showMessageDialog(null, "É múltiplo.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não é múltiplo.");
            }
        }
        else 
        {
            if (num2 % num1 == 0)
            {
                JOptionPane.showMessageDialog(null, "É múltiplo.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não é múltiplo. ");
            }
        }
    }
}
