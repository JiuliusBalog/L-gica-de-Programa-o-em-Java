// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq11 
{
    public static void main(String [] args)
    {
        double raio, circunferencia;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio: "));
        
        circunferencia = (raio * 2) * 3.14;
        
        JOptionPane.showMessageDialog(null, "Circunferência: " + circunferencia);
    }
}
