package exerciciosArray;

import javax.swing.JOptionPane;

public class Exe2 {
    public static void main(String[] args) {
        dobro();
    }

    public static void dobro() {
        String aux = JOptionPane.showInputDialog(null, "Digite 8 numeros separados por espaco");
        String a[] = aux.split(" ");

        int b[] = new int[8];

        for(int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]) *2;
        }

        StringBuilder result = new StringBuilder();
        for (int num : b) {
            result.append(num).append(" ");
        }

         JOptionPane.showMessageDialog(null, result.toString());
    }
}


//Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os 
//elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
