// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.

package Prj_EstSeq; // Nome do Pacote
import java.util.Scanner; // Biblioteca utilizada (Scanner para coleta de dados do usuário).

public class Prj_EstSeq06 // Nome da classe.
{
    public static void main (String [] args) // Programa Principal.
    {
        try(Scanner input = new Scanner(System.in)) // Inicialização do Scanner
        {
            int x; // Variável 1.
            int y; // Variável 2.
            int z; // Variável auxiliar para a troca dos valores.
            
            System.out.print("Insira o valor X: "); // Imprime tal frase na tela do usuário.
            x = input.nextInt(); // Solicita a coleta do valor de X. Ex: 2.
            System.out.print("Insira o valor Y: "); // Imprime tal frase na tela do usuário.
            y = input.nextInt(); // Solicita a coleta do valor de Y. Ex: 5.
            
            z = x; // de 0 passa a ser 2. 
            x = y; // de 2 passa a ser 5.
            y = z; // de 5 passa a ser 2
            
            System.out.println("O valor de X se tornou: " + x + " enquanto o de Y se tornou: " + y); // Exibe o resultado para o usuário.
        }
    }
}
