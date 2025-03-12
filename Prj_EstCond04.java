package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond04 
{
    public static void main(String [] args)
    {
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota: "));
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        if (media > 6.0)
        {
            JOptionPane.showMessageDialog(null, "APROVADO.");
        }
        else if ((media >= 3.0) && (media < 6.0))
        {
            JOptionPane.showMessageDialog(null, "EXAME.");
        }
        else if (media < 3.0)
        {
            JOptionPane.showMessageDialog(null, "RETIDO.");
        }
    }
}
