package Prj_EstRep;

public class Prj_EstRep11
{
   public static void main(String [] args)
   {
      int n = 2;
      int n2 = 15;
      for(int i = n; i <= n2; i++)
      {
         int valid = 0;
         for(int j = 1; j <= i; j++)
         {
            if(i % j == 0)
            {
               valid++;
            }
         }
         if(valid == 2)
         {
               System.out.println(i + " é primo.");
         }
      }
   }
}
