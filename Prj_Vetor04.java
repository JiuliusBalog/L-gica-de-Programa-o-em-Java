// Criar e coletar em um vetor [30] real e calcular e exibir:
// - A média do grupo;
// - A quantidade de notas acima do grupo;
// - As posições dos valores abaixo da média do grupo.


package Prj_VariaveisHomogeneas;

public class Prj_Vetor04
{
   public static void main (String [] args)
   {
      double [] vetor = {8,1,2,3,9,0,8,9,1,2,3,0,2,3,8,9,0,1,3,8,9,1,2,5,9,4,8,3,7,2};
      double media = 0;
      media = MediaNotas(vetor, media);
      PosicoesInferiores(vetor, media);
      NotasSuperiores(vetor, media);
   }
   public static double MediaNotas(double [] vetor, double media)
   {
      int elementos = 0;
      for(int i = 0; i < vetor.length; i++)
      {
         media = media + vetor[i];
         elementos++;
      }
      media = media / elementos;
      System.out.println("A média das notas é de: " + media);
      return media;
   }
   public static void NotasSuperiores(double [] vetor, double media)
   {
      int NotasAcima = 0;
      for(int i = 0; i < vetor.length; i++)
      {
         if(vetor[i] > media)
         {
            NotasAcima++;
         }
      }
      System.out.println("Quantidade de notas acima da média: " + NotasAcima);
   }
   public static void PosicoesInferiores(double [] vetor, double media)
   {
      for(int i = 0; i < vetor.length; i++)
      {
         if(vetor[i] < media)
         {
            System.out.println("Aluno " + i + " está com as notas abaixo da média.");
         }
      }
   }
}
