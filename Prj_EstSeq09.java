// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

package Prj_EstSeq; // Nome do Pacote.
import java.util.Scanner; // Biblioteca utilizada (Scanner).

public class Prj_EstSeq09 // Nome da Classe.
{
    public static void main (String [] args) // Programa Principal.
    {
        try(Scanner input = new Scanner(System.in)) // Iniciaçização do Scanner.
        {
            int a; // Variável 1.
            int b; // Variável 2.
            int result; // Resultado.
            
            System.out.print("Insira o primeiro valor: "); // Imprime tal frase na tela do usuário.
            a = input.nextInt(); // Coleta o valor da Variável 1.
            System.out.print("Insira o segundo valor: "); // Imprime tal frase na tela do usuário.
            b = input.nextInt(); // Coleta o valor da Variável 2.
            
            result = (a * 2) + (b * 2); // Cálculo da soma dos quadrados.
            
            System.out.println("Soma dos quadrados: " + result); // Exibe o resultado.
            
        }
    }
}
