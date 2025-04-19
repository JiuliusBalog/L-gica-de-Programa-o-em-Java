package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep06 
{
    public static void main (String [] args)
    {
        int n1;
        int n2;
        int soma;
        
        soma = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
        
        if (n1 > n2)
        {
            for (int i = 1; i <= n1; i++)
            {
                soma = soma + i;
            }
            JOptionPane.showMessageDialog(null, "Valor da somatória de " + n1 + " = " + soma);
        }
        else
        {
            for (int i = 1; i <= n2; i++)
            {
                soma = soma + i;
            }
            JOptionPane.showMessageDialog(null, "Valor da somatória de " + n2 + " = " + soma);
        }
    }
}
