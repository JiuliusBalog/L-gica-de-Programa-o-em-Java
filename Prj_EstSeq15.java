// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import java.util.Scanner;

public class Prj_EstSeq15 
{
    public static void main (String [] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            double a;
            double b;
            double c;
            
            System.out.print("Insira o primeiro cateto: ");
            a = input.nextDouble();
            System.out.print("Insira o segundo cateto: ");
            b = input.nextDouble();
            
            c = Math.sqrt((a * a) + (b * b));
            
            System.out.println("Valor do terceiro cateto: " + c);
            
        }
    }
}
