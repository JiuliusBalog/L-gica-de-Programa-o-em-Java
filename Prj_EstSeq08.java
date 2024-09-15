// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq08 
{
    public static void main(String [] args)
    {
            double deposito;
            double poupança = 0;
            
            deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado: "));
            
            poupança = (deposito * 1.3)/100 + deposito;
            
            JOptionPane.showMessageDialog(null, "O valor de rendimento da poupança é de " + poupança + ".");
    }
}
