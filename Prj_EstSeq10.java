// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba 2 números reais. Calcule e mostre a diferença desses valores.

package Prj_EstSeq;
import javax.swing.JOptionPane; 
public class Prj_EstSeq10 
{
    public static void main (String [] args)
    {
        int n1, n2, dif;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        dif = n1 - n2;
        
        JOptionPane.showMessageDialog(null, "Diferença: " + dif);
    }
}
