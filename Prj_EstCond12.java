package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond12 
{
    public static void main (String [] args)
    {
        int tipo;
        double valorinvestido;
        double valorcorrigido;
        
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de investimento: 1 = Poupança || 2 = Renda Fixa."));
        valorinvestido = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser investido: "));
        
        if (tipo == 1)
        {
            valorcorrigido = ((valorinvestido * 3) / 100 + valorinvestido);
            JOptionPane.showMessageDialog(null, "Valor corrigido após 30 dias: " + valorcorrigido);
        }
        else if (tipo == 2)
        {
            valorcorrigido = ((valorinvestido * 5) / 100 + valorinvestido);
            JOptionPane.showMessageDialog(null, "Valor corrigido após 30 dias: " + valorcorrigido);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Número inválido, escolha novamente.");
        }
    }
}
