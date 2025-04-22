// Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
// - A quantidade de cada produto vendido no mês;
// - A quantidade de produtos vendidos por semana;
// - O total de produtos vendidos no mês.

package Prj_VariaveisHomogeneas;
import javax.swing.JOptionPane;

public class Prj_Matriz01
{
   public static void main (String [] args)
   {
      int [][] matriz = new int [4][3];
      for (int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produtos. \nSemana " + i + "." + "\nProduto " + j + "."));
         }
      }
      QuantidadeMes(matriz);
      QuantidadeSemana(matriz);
      Total(matriz);
   }
   public static int [][] QuantidadeMes(int [][] matriz)
   {
      int [] produtos = new int [3];
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            produtos[j] = produtos[j] + matriz[i][j];
         }
      }
      System.out.println("Quantidade de cada produto no mês: ");
      for(int i = 0; i < 3; i++)
      {
         System.out.println("Produto " + (i + 1) + " : " + produtos[i]); 
         // i + 1 porquê assim ele imprime como Produto 1, 2 e 3 ao invés de 0, 1 e 2, sem comprometer a indexação do Vetor =D.
      }
      
      return matriz;
   }
   public static int [][] QuantidadeSemana(int [][] matriz)
   {
      int [] prodSemana = new int [4];
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            prodSemana[i] = prodSemana[i] + matriz[i][j];
         }
      }
      System.out.println("Quantidade de vendas do produto por semana: ");
      for(int i = 0; i < 4; i++)
      {
         System.out.println("Vendas da semana " + (i + 1) + " : " + prodSemana[i]); 
      }
      
      return matriz;
   }
   public static int [][] Total(int [][] matriz)
   {
      int total = 0;
      
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            total = total + matriz[i][j];
         }
      }
      System.out.println("Total de produtos vendidos no mês: " + total);
      return matriz;
   }
}
