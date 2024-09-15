// Nome do programa: Prj_EstSeq01
// Programador: Jiulius Cesar Pereira B. Silva
// Data: 23/06/24
// Objetivo do programa: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.

package Prj_EstSeq; // Nome do Pacote.
import javax.swing.JOptionPane; // Biblioteca utilizada (JOptionPane para interface gráfica).

public class Prj_EstSeq07 // Nome da Classe.
{
    public static void main(String [] args) // Programa Principal.
    {
        double comprimento; // Variável 1.
        double largura; // Variável 2.
        double altura; // Variável 3.
        double volume; // Resultado.
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do paralelepipedo: ")); // Solicita coleta de dados para a Variável 1.
        largura = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do paralelepipedo: ")); // Solicita coleta de dados para a Váriavel 2.
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do paralelepipedo: ")); // Solicita coleta de dados para a Variável 3.
        
        volume = comprimento * altura * largura; // Cálculo de volume do paralelepípedo.
        
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é: " + volume); // Exibe o resultado.
        
             
    }
}
