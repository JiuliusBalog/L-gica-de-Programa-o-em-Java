package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond03 
{
    public static void main (String [] args)
    {
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o coeficiente C: "));
        
        delta = (b * b) - (4 * a * c);
        
        if (delta < 0)
        {
            JOptionPane.showMessageDialog(null, "Não ha raízes reais");
            JOptionPane.showMessageDialog(null, delta);
        }
        else if (delta == 0)
                {
                    x1 = (-b) / (2 * a);
                    JOptionPane.showMessageDialog(null, "Raiz: " + delta);
                    JOptionPane.showMessageDialog(null, "Valor de X" + x1);
                }
        else if (delta > 0)
        {
            x1 = (-b) + (Math.sqrt(delta)) / (2 * a);
            x2 = (-b) - (Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Raiz 1: " + x1);
            JOptionPane.showMessageDialog(null, "Raiz 2: " + x2);
        }
        
    }
}
