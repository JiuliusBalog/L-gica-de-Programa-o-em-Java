// Nome do programa: Prj_EstSeq03.
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.

package Prj_EstSeq; // Nome do pacote.
import java.util.Scanner; // Biblioteca a ser utilizada (nesse caso, o Scanner para coleta de dados do usuário).

public class Prj_EstSeq03 // Nome da Classe.
{
    public static void main (String [] args) // Início do Programa Principal.
    {
        try(Scanner input = new Scanner(System.in)) // Inicialização do Scanner.
        {
            float base; // Variável 1.
            float altura; // Variável 2.
            float area; // Resultado do cálculo.
                  
            System.out.print("Insira a base do triângulo: "); // Imprime tal frase para o usuário.
            base = input.nextFloat(); // Solicita envio de dados para a variável 1.
            System.out.print("Insira a altura do triângulo: "); // Imprime tal frase para o usuário.
            altura = input.nextFloat(); // Solicita envio de dados para a variáveç 2.
            
            area = (base * altura) / 2; // Cálculo do triângulo.
            
            System.out.println(area); // Imprime o resultado para o usuário.
        }
    }
}
