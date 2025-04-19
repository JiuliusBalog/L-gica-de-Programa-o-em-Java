package Prj_EstRep;
import javax.swing.JOptionPane;

public class Prj_EstRep02 
{
    public static void main(String [] args)
    {
        int i;
        int potencia;
        
        for (i = 10; i < 151; i++)
        {
            potencia = i * i;
            JOptionPane.showMessageDialog(null, "Potência de " + i + " = " + potencia);
        }
    }
}
