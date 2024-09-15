// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba 2 números reais. Calcule e mostre a diferença desses valores.

package Prj_EstSeq;
import java.util.Scanner; 
public class Prj_EstSeq10 
{
    public static void main (String [] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            int n1;
            int n2;
            int dif;
            
            System.out.print("Insira o primeiro valor: ");
            n1 = input.nextInt();
            System.out.print("Insira o segundo valor: ");
            n2 = input.nextInt();
            
            dif = n1 - n2;
            
            System.out.println("Diferença dos valores: " + dif);
        }
    }
}
