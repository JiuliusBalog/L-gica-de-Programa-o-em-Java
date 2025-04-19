package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep09
{
    public static void main(String [] args)
    {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número")); //Valor inicial pra setar os valores de maior e menor sem usar valor hardcoded
        double maior = n;
        double menor = n;
        for(int i = 0; i < 4; i++)
        {
            n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
            if(n > maior)
            {
                maior = n;
            }
            if(n < menor)
            {
                menor = n;
            } 
        }
        System.out.println("Maior = " + maior + "\nMenor = " + menor);
   }
}
