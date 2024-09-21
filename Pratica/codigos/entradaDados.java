import javax.swing.JOptionPane;

public class entradaDados {
    
    public static void main(String[] args) {
        questao1(); 
    }
    
    public static void questao1(){
        //entrada
        //showInputDialog = mostra caixa de entrada
        //null pois nao tem alinamento, vai ficar centralizada no centro da tela
        String entrada = JOptionPane.showInputDialog(null, "Digite a idade:");
        int idade = Integer.parseInt(entrada);
        
        //processamento e saída
        if(idade >= 18){
            JOptionPane.showMessageDialog(null,"Maior de idade");
        } else{
            JOptionPane.showMessageDialog(null,"Menor de idade");
        }
    }
}

//JOptionPane = mostra caixa pro usuario ler/ escrever
                //Le os dados do usuario e joga resultado dentro de um objeto da classe