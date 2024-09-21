package exerciciosSelecao;

import javax.swing.JOptionPane;

public class Exe4 {
    public static void main(String[] args) {
        comparison();
    }

    public static void comparison(){
        String numberA = JOptionPane.showInputDialog(null, "Digite um numero");
        int a = Integer.parseInt(numberA);

        String numberB = JOptionPane.showInputDialog(null, "Digite um numero");
        int b = Integer.parseInt(numberB);

        if(a % b == 0){
            JOptionPane.showMessageDialog(null, "Sao multiplos");
        }

        else{
            JOptionPane.showMessageDialog(null, "Nao sao multiplos");
        }
    }
}
