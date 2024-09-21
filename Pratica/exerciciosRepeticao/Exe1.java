package exerciciosRepeticao;
import javax.swing.JOptionPane;

public class Exe1 {
    
    public static void main(String[] args) {
        values();
    }

    public static void values() {
        String valor = JOptionPane.showInputDialog(null, "Digite os valores");
        int novoValor = Interger.parseInt(valor);
    }
}

//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final a soma dos valores informados, 
//a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores 
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
