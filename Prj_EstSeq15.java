// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq15 
{
    public static void main (String [] args)
    {
        double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro cateto: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo cateto: "));
        c = Math.sqrt((a * a) + (b * b));
            
        JOptionPane.showMessageDialog(null, "Valor do terceiro cateto: " + c);
    }
}
