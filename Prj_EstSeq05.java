// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes).

package Prj_EstSeq; 
import javax.swing.JOptionPane; 

public class Prj_EstSeq05 
{
    public static void main(String [] args) 
    {
        double a, b, c, delta, raiz1, raiz2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Insira o Coeficiente A: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insira o Coeficiente B: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insira o Coeficiente C: "));
        
        delta = (Math.pow(b, 2)) - (4 * a * c);
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b + Math.sqrt(delta)) / (2 * a);
        
        JOptionPane.showMessageDialog(null, "Raíz 1: " + raiz1 + "\nRaíz 2: " + raiz2);
    }
}
