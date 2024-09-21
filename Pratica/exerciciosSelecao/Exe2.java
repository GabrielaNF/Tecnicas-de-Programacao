package exerciciosSelecao;
import javax.swing.JOptionPane;

public class Exe2 {
    
    public static void main (String[] args) {
        password();
    }

    public static void password() {
        String senha = JOptionPane.showInputDialog(null, "Digite sua senha"); //So recebe string
        int pass = Integer.parseInt(senha); //converte string para inteiro

        if (pass == 34567){
            JOptionPane.showMessageDialog(null, "Acesso autorizado");
        }

        else{
            JOptionPane.showMessageDialog(null, "Acesso negado");
        }
    }
}

//Elabore um algoritmo que lê um número que representa uma senha, verifica se a senha está correta ou não, 
//comparando-a com a senha 34567, e informa "Acesso autorizado" ou "Acesso negado", conforme o caso. 
