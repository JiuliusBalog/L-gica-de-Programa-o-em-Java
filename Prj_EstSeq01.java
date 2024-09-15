// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

package Prj_EstSeq; // Pacote (ou a "pasta") do projeto
import java.util.Scanner; // Biblioteca do Scanner

public class Prj_EstSeq01 // Classe
{
    public static void main (String [] args) // Programa principal
    {
        try(Scanner input = new Scanner(System.in)) // Inicia o Scanner
        {
            int lado; // Variável 1
            int area; // Variável 2
            
            System.out.print("Insira o lado do quadrado: "); // Escreva ("Insira o lado do quadrado: ")
            lado = input.nextInt(); // Leia (lado)
            
            area = lado * lado; // Cálculo
            
            System.out.println(area); // Escreva(area)
        }
    }
}
