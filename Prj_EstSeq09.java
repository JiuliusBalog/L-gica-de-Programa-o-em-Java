// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

package Prj_EstSeq; 
import javax.swing.JOptionPane; 

public class Prj_EstSeq09 
{
    public static void main (String [] args)
    {
        int a, b, result;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        result = (a * 2) + (b * 2);
        
        JOptionPane.showMessageDialog(null, "Soma dos Quadrados: " + result);
    }
}
