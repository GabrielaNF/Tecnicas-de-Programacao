package exerciciosSelecao;

import javax.swing.JOptionPane;

public class Exe3 {
    
    public static void main(String[] args) {
        height();
    }

    public static void height(){
        String tall = JOptionPane.showInputDialog(null, "Digite sua altura");
        int number = Integer.parseInt(tall);

        if(number < 150){
            JOptionPane.showMessageDialog(null, "Abaixo de um metro e meio");
        }

        else if(number > 150 && number < 180){
            JOptionPane.showMessageDialog(null, "entre um metro e meio e um metro e oitenta centímetros");
        }

        else {
            JOptionPane.showMessageDialog(null, "acima de um metro e oitenta centímetros");
        }
    }
}
