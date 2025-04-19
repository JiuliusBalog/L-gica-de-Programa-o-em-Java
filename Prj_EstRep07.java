//INCOMPLETO

package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep07 
{
    public static void main (String [] args)
    {
        double n = 5;
        double seq = 2; // como se já tivesse acontecido o 1 + 1/1;
        double fat = 1;
        
        for(double i = 1; i < n; i++)
        {
            fat = fat * i + fat;
            seq = (1 / fat) + seq;
        }
        System.out.print(seq);
    }
}

// 1 + 1/1! + 1/2!... 1/N!
// seq(1) + (seq/fat) 
