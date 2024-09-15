// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq14 
{
    public static void main (String [] args)
    {
        int a;
        int b;
        int c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro ângulo"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo ângulo"));
        
        c = a + b;
        
        c = 180 - c;
        
        JOptionPane.showMessageDialog(null, "O terceiro ângulo do triângulo é: " + c);
    }
}
