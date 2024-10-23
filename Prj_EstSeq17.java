// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq17
{
    public static void main (String [] args)
    {
        int tempo;
        double vmedia, litros;
         
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de percurso: "));
        vmedia = Double.parseDouble(JOptionPane.showInputDialog("Insira a velocidade média: "));;
            
        litros = (tempo * vmedia) / 12;
            
        JOptionPane.showMessageDialog(null, "Quantidade de litros: " + litros);
    }
}
