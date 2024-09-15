// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes).

package Prj_EstSeq; // Nome do Pacote.
import java.util.Scanner; // Biblioteca utilizada (Scanner para coleta de dados do usuário).

public class Prj_EstSeq05 // Nome da classe.
{
    public static void main(String [] args) // Programa Principal.
    {
      try(Scanner input = new Scanner(System.in)) // Inicialização do Scanner.
      {
          double a; // Coeficiente A.
          double b; // Coeficiente B.
          double c; // Coeficiente C.
          double delta; // Delta para o cálculo de Bhaskara.
          double raiz; // Resultado do cálculo.
          
          System.out.print("Insira o coeficiente A: "); // Imprime tal frase na tela do usuário.
          a = input.nextDouble(); // Solicita a coleta do valor do coeficiente A.
          System.out.print("Insira o coeficinete B: "); // Imprime tal frase na tela do usuário.
          b = input.nextDouble(); // Solicita a coleta do valor do coeficiente B.
          System.out.print("Insira o coeficiente C: "); // Imprime tal frase na tela do usuário.
          c = input.nextDouble(); // Solicita a coleta do valor do coeficiente C.
          
          delta = (Math.pow(b, 2)) - (4 * a * c); // Cálculo de Delta.
          
          raiz = (-b + Math.sqrt(delta)) / (2 * a); // Cálculo da primeira raíz.
          System.out.println("raiz 1: " + raiz); // Imprime o resultado.
          
          raiz = (-b - Math.sqrt(delta)) / (2 * a); // Cálculo da segundo raíz.
          System.out.println("raiz 2: " + raiz); // Imprime o resultado.
          
      }
    }
}
