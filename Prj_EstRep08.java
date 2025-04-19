package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep08 
{
    public static void main (String [] args)
    {
        int n;
        double soma;
        double i;
        double j;
        
        j = 1;
        soma = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        
        for (i = 0; i <= n; i++)
        {
            i = soma + j;
            j = soma;
            soma = i;
            System.out.println(soma);
        }
    }
}
// 0,1,1,2,3,5,8,13,21,34,55,89,144