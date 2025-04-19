package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep10 
{
    public static void main (String [] args)
    {
        long i; // casas
        long graos; // grãos na casa
        
        graos = 1;
        for (i = 1; i <= 64; i ++)
        {
            System.out.println("Casa " + i + " Quantidade de Grãos: " + graos);
            graos = graos * 2;
        }
    }
}
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 516, 1024