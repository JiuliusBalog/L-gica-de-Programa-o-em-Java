package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond01 
{
    public static void main (String [] args)
    {
        double num1;
        double num2;
        double dif;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        if (num1 > num2)
        {
            dif = (num1 - num2);
        }
        else
        {
            dif = (num2 - num1);
        }
        JOptionPane.showMessageDialog(null, "A diferença é de: " + dif);
    }
}
