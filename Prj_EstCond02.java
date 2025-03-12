package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond02 
{
    public static void main(String [] args)
    {
        double num1;
        double num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        if (num1 > num2)
        {
            JOptionPane.showMessageDialog(null, num1);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, num2);
        }
    }
}
