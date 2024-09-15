// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import java.util.Scanner;

public class Prj_EstSeq11 
{
    public static void main(String [] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            double raio;
            double circunferencia;
            
            System.out.print("Insira o raio da circunferência: ");
            raio = input.nextDouble();
            
            circunferencia = (raio * 2) * 3.14;
            
            System.out.println("Valor de circunferência: " + circunferencia);
        }
    }
}
