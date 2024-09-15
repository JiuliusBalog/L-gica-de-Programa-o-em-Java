// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

package Prj_EstSeq;
import java.util.Scanner;

public class Prj_EstSeq16
{
    public static void main (String [] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            int qh;
            int nd;
            double vh;
            int pd;
            double salariobruto;
            double salarioliquido;
            
            System.out.print("Insira a quantidade de horas trabalhadas: ");
            qh = input.nextInt();
            System.out.print("Insira o valor por hora trabalhada: ");
            vh = input.nextDouble();
            System.out.print("Insira o percentual de desconto: ");
            pd = input.nextInt();
            System.out.print("Insira o número de dependentes: ");
            nd = input.nextInt();
            
            salariobruto = qh * vh;
            salarioliquido = (salariobruto - (salariobruto * pd)/100);
            salarioliquido = salarioliquido + (nd * 100);
            
            System.out.println("Salário calculado: " + salarioliquido);
        }    
    }
}
