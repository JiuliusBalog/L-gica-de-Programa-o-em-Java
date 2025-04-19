// O Objetivo deste código é concatenar valores dos Vetores 1 e 2 (ambos com 3 posições) dentro do Vetor 3 (de 6 posições).
// Exemplo: 
// Vetor 1: 1, 2, 3;
// Vetor 2: 4, 5, 6;
// Vetor 3: 1, 2, 3, 4, 5, 6;

package Prj_VariaveisHomogeneas;

public class Prj_Vetor03
{
   public static void main (String [] args)
   {
      int [] vetor1 = {8,9,4};
      int [] vetor2 = {7,1,5};
      int [] vetor3 = new int [6];
      
      for(int i = 0; i < vetor3.length - 3; i++)
      {
         vetor3[i] = vetor1[i];
         vetor3[i + 3] = vetor2[i];
      }
      for(int i = 0; i < vetor3.length; i++)
      {
         System.out.println("Posição " + i + ": " + vetor3[i]);
      } 
   }
}
