package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep15 
{
    public static void main (String [] args)
    {
        int base;
        int expoente;
        int valor;
        int i;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base: "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Insira o expoente: "));
        valor = base;
        
        for(i = 1; i <= expoente; i++)
        {
            System.out.println(base);
            base = base * valor;
        }
    }
}
