// Nome do programa: Prj_EstSeq02
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq02 // Classe do projeto
{
    public static void main (String [] args) // Programa principal
    {
        double salario, salarioliq;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário: "));
        
        salarioliq = (salario * 0.15) + salario;
        JOptionPane.showMessageDialog(null, "Salário reajustado: " + salarioliq);
    }
}
