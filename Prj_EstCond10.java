package Prj_EstCond;
import javax.swing.JOptionPane;

public class Prj_EstCond10 
{
    public static void main(String [] args)
    {
        double numerovoltas;
        double circuito;
        double tempo;
        double velocidademedia;
        
        numerovoltas = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de voltas: "));
        circuito = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito (em Metros): "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de percurso (em Minutos): "));
        
        if ((numerovoltas <= 0) || (circuito <= 0) || (tempo <= 0))
        {
            JOptionPane.showMessageDialog(null, "ERRO !!! Insira valores válidos (acima de 0).");
        }
        else
        {
        
            circuito = (circuito / 1000); // Converte de metros pra quilometros.
            tempo = (tempo / 60); // Converte de minutos pra horas.
            velocidademedia =  (circuito / tempo); // Cálculo de velcoidade média.
            
            JOptionPane.showMessageDialog(null, "Velocidade Média (em Km/h): " + velocidademedia);
            
        }
        
    }
}
