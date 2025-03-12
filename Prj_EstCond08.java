package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond08 
{
    public static void main (String [] args)
    {
        int hi, hf, mi, mf, horas, minutos;
        
        horas = 0;
        minutos = 0;
        
        hi = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de início: "));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de fim: "));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de início: "));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de fim: "));
        
        if ((hi < 0) || (hi > 24) || (hf < 0) || (hf > 24))
        {
            JOptionPane.showMessageDialog(null, "Erro, horas não podem ser maiores do que 24 horas nem menores do que 0 horas");
        }
        else
        {
            if ((mi < 0) || (mi > 60) || (mf < 0) || (mf > 60))
            {
                JOptionPane.showMessageDialog(null, "Erro, minutos não podem ser maiores do que 60 minutos nem menores do que 0 minutos");
            }
            else
            {
                if (hi > hf)
                {
                    horas = (hf + 24) - hi;
                }
                else
                {
                    horas = hf - hi;
                }
                if (mi > hf)
                {
                    minutos = (mf + 60) - mi;
                    horas = horas - 1;
                }
                else
                {
                    minutos = (mi + 60) - mf;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Tempo de jogo: " + horas + " horas " + "e " + minutos + " minutos.");
    }
}
