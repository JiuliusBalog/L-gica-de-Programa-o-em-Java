package Prj_EstRep;
import javax.swing.JOptionPane;
        
public class Prj_EstRep01 
{
    public static void main (String [] args)
    {
        int anoatual;
        int anonasc;
        int mesatual;
        int mesnasc;
        int diaatual;
        int dianasc;
        int anos;
        int meses;
        int dias;
        
        anos = 0;
        meses = 0;
        dias = 0;
        
        anonasc = Integer.parseInt(JOptionPane.showInputDialog("Insira seu ano de nascimento: "));
        mesnasc = Integer.parseInt(JOptionPane.showInputDialog("Insira seu mês de nascimento: "));
        dianasc = Integer.parseInt(JOptionPane.showInputDialog("Insira seu dia de nascimento: "));
        anoatual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));
        mesatual = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual: "));
        diaatual = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));
        
        if ((mesnasc <= 0) || (mesnasc > 12) || (mesatual < 0) || (mesatual > 12))
        {
            JOptionPane.showMessageDialog(null, "Erro, insira um mês válido.");
        }
        else
        {
            if ((dianasc < 0) || (dianasc > 31) || (diaatual < 0) || (diaatual > 31) )
            {
                JOptionPane.showMessageDialog(null, "Erro, insira um dia válido");
            }
            else
            {
                if (anonasc > anoatual)
                {
                    JOptionPane.showMessageDialog(null, "Erro, insira um ano válido");
                }
                else
                {
                    anos = anoatual - anonasc;
                    while (anonasc < anoatual)
                    {
                        if (anonasc % 4 == 0)
                        {
                            dias = dias + 1;
                            anonasc = anonasc + 1;
                        }
                        else
                        {
                            anonasc = anonasc + 1;
                        }
                    }
                    if (mesatual > mesnasc)
                    {
                        meses = (mesnasc + 12) - mesatual;
                    }
                    else
                    {
                        meses = (mesatual + 12) - mesnasc;
                        anos = anos - 1;
                    }
                    if (diaatual > dianasc)
                    {
                        dias = diaatual - dianasc + dias;
                    }
                    else
                    {
                        dias = dianasc - diaatual + dias;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");
        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");
    }
}
