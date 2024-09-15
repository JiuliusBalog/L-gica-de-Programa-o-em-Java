// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import java.util.Scanner;

public class Prj_EstSeq17
{
    public static void main (String [] args)
    {
        try(Scanner input = new Scanner(System.in))
        {    
            int tempo;
            double vmedia;
            double litros;
            
            System.out.print("Insira o tempo: ");
            tempo = input.nextInt();
            System.out.print("Insira a velocidade média: ");
            vmedia = input.nextInt();
            
            litros = (tempo * vmedia) / 12;
            
            System.out.println("Quantidade de litros: " + litros);
        }
       
    }
}
