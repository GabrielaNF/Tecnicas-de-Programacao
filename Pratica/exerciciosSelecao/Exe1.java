package exerciciosSelecao;
import javax.swing.JOptionPane;

public class Exe1 {
    
    public static void main (String[] args){
        intervalo();
    }

    public static void intervalo(){
        String entrada = JOptionPane.showInputDialog(null, "Digite um numero");
        int numero = Integer.parseInt(entrada);

        if(numero >= 5 && numero <= 20){
            JOptionPane.showMessageDialog(null, "Eh um numero entre 5 e 20");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nao eh um numero entre 5 e 20");
        }
    }
}

// Escreva um algoritmo que leia um valor verifique se ele se 
//encontra no intervalo entre 5 e 20. 