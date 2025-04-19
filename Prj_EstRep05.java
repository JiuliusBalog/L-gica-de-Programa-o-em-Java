package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep05 
{
    public static void main (String [] args)
    {
        int i;
        int n;
        int tabuada;
        int l;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Insira o limite desejado: "));
        
        if (l > 0)
        {
            for(i = 0; i <= l; i++)
            {
                tabuada = n * i;
                JOptionPane.showMessageDialog(null, n + " * " + i + " = " + tabuada);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro. Insira um número válido.");
        }
        
    }
}
