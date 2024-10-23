// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq16
{
    public static void main (String [] args)
    {
        int qh, nd, pd;
        double vh, salariobruto, salarioliquido;
        
        qh = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));   
        vh = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora: "));   
        pd = Integer.parseInt(JOptionPane.showInputDialog("Insira o percentual de desconto: "));   
        nd = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº de dependentes: "));
            
        salariobruto = qh * vh;
        salarioliquido = (salariobruto - (salariobruto * pd)/100);
        salarioliquido = salarioliquido + (nd * 100);
            
        JOptionPane.showMessageDialog(null, "Salário calculado: " + salarioliquido);    
    }
}
