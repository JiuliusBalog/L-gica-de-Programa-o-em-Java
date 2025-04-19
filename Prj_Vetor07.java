// A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
// Disclaimer: Estarei instanciando a Classe que executa a função de Ordenação do exercício anterior para economizar linhas de código e tornar o mesmo mais legível.
// Obrigado =D.

package Prj_VariaveisHomogeneas;
import javax.swing.JOptionPane;

public class Prj_Vetor07
{
   public static void main (String [] args)
   {
      Prj_Vetor06 ordena = new Prj_Vetor06();
      
      int [] vetor = {4,7,3,8,9,2,8,5,9,0,3,7,3,1,2,3,0,8,7,5};
      int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para busca: "));
      int low = 0, high = vetor.length - 1, mid = 0, valid = 0;
      
      ordena.Sort(vetor);
      while(low <= high)
      {
            mid = (low + high)/2;
            if(n > vetor[mid])
            {
                low = mid + 1;
            }
            else if(n < vetor[mid])
            {
                high = mid - 1;
            }
            else if(n == vetor[mid])
            {
                System.out.println("O valor " + n + " existe dentro do vetor.");
                valid = 1;
                break;
            }
      }
      if(valid == 0)
      {
            System.out.println("O valor " + n + " não existe dentro do vetor.");
      }
   }
}
        
