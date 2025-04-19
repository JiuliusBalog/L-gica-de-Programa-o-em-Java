// Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
// E (i ~ 10) = [A[i] - A[21 - i];]

package Prj_VariaveisHomogeneas;

public class Prj_Vetor05
{
   public static void main (String [] args)
   {
      int [] vetor = {8,9,2,3,4,8,9,0,1,2,3,8,9,2,3,4,8,9,0,1,2,3};
      int soma = 0;
      
      for(int i = 0; i <= 10; i++)
      {
         soma = soma + (vetor[i] - vetor[20 - i]);
      }
      System.out.println("A somatória da expressão é: " + soma);
   }
}
