// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.

package Prj_EstSeq; 
import javax.swing.JOptionPane; 

public class Prj_EstSeq07 
{
    public static void main(String [] args) 
    {
        double comprimento, altura, largura, volume;
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o altura: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Insira o largura: "));
        
        volume = comprimento * altura * largura;
        
        JOptionPane.showMessageDialog(null, "Volume do paralelepípedo: " + volume);
    }
}
