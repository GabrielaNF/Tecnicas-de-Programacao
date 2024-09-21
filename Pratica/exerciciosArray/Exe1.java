package exerciciosArray;

import javax.swing.JOptionPane;

public class Exe1 {

    public static void main (String [] args) {

        String aux = JOptionPane.showInputDialog(null, "Digite 5 numeros separados por espaco");

        String a[] = aux.split( " " ); //separa de acordo com o caracter escolhido, no caso, o espaco
        String b[] = new String[5];

        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

        JOptionPane.showMessageDialog(null, a);
    }
}