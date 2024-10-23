// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

package Prj_EstSeq;
import javax.swing.JOptionPane;

public class Prj_EstSeq01
{
    public static void main (String [] args)
    {
        int lado, area;
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("Insira o lado do quadrado: "));
        
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "Área do Quadrado: " + area);
    }
}
