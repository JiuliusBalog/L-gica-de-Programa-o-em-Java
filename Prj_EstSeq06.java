// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

package Prj_EstSeq; 
import java.util.Scanner; 

public class Prj_EstSeq06 
{
    public static void main (String [] args)
    {
        int v1, v2, aux = 0;
        
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor: "));
        
        aux = v1;
        v1 = v2;
        v2 = aux;
        
        JOptionPane.showMessageDialog(null, "Valor 1: " + v1 + "\nValor 2: " + v2);
    }
}
