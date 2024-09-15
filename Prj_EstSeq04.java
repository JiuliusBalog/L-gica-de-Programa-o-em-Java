// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

package prj_estseq01; // Nome do Pacote.
import java.util.Scanner; // Biblioteca utilizada (Scanner para coleta de dados do usuário).

public class Prj_EstSeq04 // Nome da Classe.
{
    public static void main(String [] args) // Programa Principal.
    {
        try(Scanner input = new Scanner(System.in)) // Inicialização do Scanner.
        {
            
        int celsius; // Variável 1.
        int fahrenheit; // Variável 2 como resultado do cálculo.
        
        System.out.print("Insira a temperatura em graus Celsius: "); // Imprime tal frase na tela para o usuário.
        celsius = input.nextInt(); // Solicita coleta de dados para a variável 1.
        
        fahrenheit = (9*celsius+160)/5; // Cálculo de conversão de Celsius para Fahrentheit
        
        System.out.println(fahrenheit); // Exibe o resultado pro usuário.
        }
    }
}