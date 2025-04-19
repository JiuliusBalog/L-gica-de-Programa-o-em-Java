package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep03 
{
    public static void main (String [] args)
    {
        int i;
        int n;
        int fat;
        
        i = 1;
        fat = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira o número :"));
        
       while (i <= n)
       {
           fat = fat * i;   
           i = i + 1;
       }
       JOptionPane.showMessageDialog(null, "Fatorial de " + n + " = " + fat);
    }
}


