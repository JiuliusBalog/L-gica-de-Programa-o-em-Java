// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

package Prj_EstSeq; 
import javax.swing.JOptionPane; 

public class Prj_EstSeq04 
{
    public static void main(String [] args) 
    {
        int celsius, fahrenheit;
        
        celsius = Integer.parseInt(JOptionPane.showInputDialog("Insira a temperatura em graus Celsius: "));
        
        fahrenheit = (9 * celsius + 160) / 5;
        
        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fahrenheit);
    }
}
