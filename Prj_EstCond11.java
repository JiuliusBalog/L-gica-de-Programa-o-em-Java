package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond11 
{
    public static void main (String [] args)
    {
        double preçoatual;
        double mediamensal;
        double novopreço;
        
        preçoatual = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual: "));
        mediamensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a média mensal: "));
        
        if ((preçoatual < 30) && (mediamensal < 500))
        {
            novopreço = ((preçoatual * 10) / 100 + preçoatual);
            JOptionPane.showMessageDialog(null, "Novo preço: " + novopreço);
        }
        else if ((preçoatual >= 30) && (preçoatual < 80) && (mediamensal >= 500) && (mediamensal < 1000 ))
        {
            novopreço = ((preçoatual * 15) / 100 + preçoatual);
            JOptionPane.showMessageDialog(null, "Novo preço: " + novopreço);
        }
        else if ((preçoatual >= 80) && (mediamensal >= 1000))
        {
            novopreço = ((preçoatual * 5) / 100 + preçoatual);
            JOptionPane.showMessageDialog(null, "Novo preço: " + novopreço);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Novo preço: " + preçoatual);
        }
    }
}
