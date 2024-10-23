// Nome do programa: Prj_EstSeq03.
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq03 
{
    public static void main (String [] args) 
    {
        double base, altura, area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo: "));
        
        area = (base * altura) / 2;
        
        JOptionPane.showMessageDialog(null, "Área do triângulo: " + area);
    }
}
