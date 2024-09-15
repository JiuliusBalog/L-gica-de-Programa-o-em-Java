// Nome do programa: Prj_EstSeq02
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.

package Prj_EstSeq; // Nome do pacote 
import java.util.Scanner; // Nome da biblioteca usada (Scanner para coleta de valores do usuário)

public class Prj_EstSeq02 // Classe do projeto
{
    public static void main (String [] args) // Programa principal
    {
        try(Scanner input = new Scanner(System.in)) // Início do Scanner
        {
            int salario; // Variável 1
            int salreajuste; // Variável 2
            
            System.out.print("Insira o seu salário: "); // Imprime a frase na tela
            salario = input.nextInt(); // Solicita inserção de valor ao usuário
            
            salreajuste = (salario * 15) / 100 + salario;
                    
            System.out.println(salreajuste);
        }
    }
}
