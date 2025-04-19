// Criar e coletar um vetor [50] inteiro. Calcular e exibir:
// - A média dos valores entre 10 e 200; 
// - A soma dos números ímpares.

package Prj_VariaveisHomogeneas;
import javax.swing.JOptionPane;

public class Prj_Vetor01
{
   public static void main (String [] args)
   {
      int [] vetor = new int [50];
      for(int i = 0; i < vetor.length; i++)
      {
         vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor na posição " + i + " do vetor."));
      }
      MediaVetor(vetor); // Coleta valores em um intervalo de 10 e 200 e realiza uma média com os mesmos.
      SomaImpar(vetor); // Coleta apenas valores ímpares e realiza uma somátoria com os mesmos.
   }
   public static void MediaVetor (int [] vetor)
   {
      double media = 0;
      int intervalo = 0;
      for(int i = 0; i < vetor.length; i++)
      {
         if(vetor[i] >= 10 && vetor[i] <= 200)
         {
            media = media + vetor[i];
            intervalo++;
         }
      }
      media = media / intervalo;
      System.out.println("A média dos valores entre 10 e 200 é: " + media);
   }
   public static void SomaImpar(int [] vetor)
   {
      int soma = 0;
      for(int i = 0; i < vetor.length; i++)
      {
         if(vetor[i] % 2 == 1)
         {
            soma = soma + vetor[i];
         }
      }
      System.out.println("Somatória dos valores ímpares: " + soma);
   }
}

// 236 / 3 = 78,66
// 11 + 1 + 255 + 7 + 199 = 473
