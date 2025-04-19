// Criar e coletar em um vetor [20] com números aleatórios. Classifique este vetor em ordem crescente e mostre os dados.

package Prj_VariaveisHomogeneas;

public class Prj_Vetor06
{
   public static void main (String [] args)
   {
      int [] vetor = {4,7,3,8,9,2,8,5,9,0,3,7,3,1,2,3,0,8,7,5};
      Sort(vetor);
      for(int i = 0; i < vetor.length; i++)
      {
         System.out.print(vetor[i] + " ");
      }
   }
   public static int [] Sort (int [] vetor)
   {
      int aux = 0;
      for(int i = 0; i < vetor.length; i++)
      {
         for(int j = i + 1; j < vetor.length; j++)
         {
            if(vetor[i] > vetor[j])
            {
               aux = vetor[i];
               vetor[i] = vetor[j];
               vetor[j] = aux;
            }
         }
      }
      System.out.print("Vetor ordenado: ");
      return vetor;
   }
}
