// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq12 
{
    public static void main (String [] args)
    {
        int ANascimento;
        int AAtual;
        int idade;
        
        ANascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));
        AAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
        
        idade = (AAtual - ANascimento) + 17;
        
        JOptionPane.showMessageDialog(null, "Sua idade daqui 17 anos será de " + idade + " anos de idade.");
    }
}
