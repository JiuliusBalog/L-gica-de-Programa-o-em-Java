// Criar e coletar um vetor [100] inteiro e exibir:
// - O maior e o menor valor;
// - A média dos valores.


package Prj_VariaveisHomogeneas;

public class Prj_Vetor02
{
   public static void main (String [] args)
   {
      int [] vetor = {41,82,33,96,10,21};
      MaiorMenor(vetor); // Verifica e mostra o Menor e o Maior valor dentro do Vetor.
      MediaVetor(vetor); // Realiza uma média com todos os valores presentes no Vetor.
   }
   public static int [] MaiorMenor(int [] vetor)
   {
      int max = 0;
      int min = 0;
      
      for(int i = 0; i < vetor.length; i++)
      {
         
         if(i == 0)
         {
            max = vetor[i];
            min = vetor[i];
         }
         if(vetor[i] > max)
         {
            max = vetor[i];
         }
         if(vetor[i] < min)
         {
            min = vetor[i];
         }
      }
      System.out.println("Valor máximo: " + max + "\nValor mínimo: " + min);
      return vetor;
   }
   public static int [] MediaVetor (int [] vetor)
   {
      double media = 0;
      int elementos = 0;
      
      for(int i = 0; i < vetor.length; i++)
      {
         media = media + vetor[i];
         elementos++;
      }
      media = media / elementos;
      System.out.println("A média dos valores é: " + media);
      return vetor;
   }
}
