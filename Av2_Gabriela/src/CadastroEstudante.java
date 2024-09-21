import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.String;

public class CadastroEstudante {
    public static void main(String[] args) {
        String continua = "S";

        ArrayList<Estudante>registros = new ArrayList<Estudante>();

        do {
            String tipo = JOptionPane.showInputDialog(null, "Graduacao(G) ou Especializacao(E)?");

            if (tipo.equalsIgnoreCase("G")) {
                String entrada = JOptionPane.showInputDialog(null, "Digite seu nome, frequencia e nota");

                String partes[] = entrada.split(" ");

                Graduacao g = new Graduacao ( partes[0],
                Integer.parseInt(partes[1]),
                Integer.parseInt(partes[2]));


                    registros.add (g);
            }    
            
            else if ( tipo.equalsIgnoreCase( "E") ) {
                String entrada = JOptionPane.showInputDialog(null, "Digite seu nome, frequencia e nota");

                String partes[] = entrada.split(" ");

                Especializacao e = new Especializacao ( partes[0],
                Integer.parseInt(partes[1]),
                Integer.parseInt(partes[2]));

                registros.add( e );
            }

            continua = JOptionPane.showInputDialog(null, "Deseja continuar?");
        }while (continua.equalsIgnoreCase("s"));

        for(int i = 0; i < registros.size(); i++) {
            Estudante a = registros.get(i); //arraylist retorna Base / Recupera uma base
            if ( a instanceof Graduacao ) { //se entrou nesse if eh porque b eh um Graduacao
                Graduacao g = (Graduacao) a; //Recupera Graduacao (sai de Base e vira Graduacao)
                if (g.isAprovado() == true) {
                    JOptionPane.showMessageDialog(null, "" + g.getNome() + " = Aprovado \n");
                }
                else {
                    JOptionPane.showMessageDialog(null, "" + g.getNome() + " = Reprovado \n");

                }
            }

            else if ( a instanceof Especializacao) {
                Especializacao e = (Especializacao) a;
                if (e.isAprovado() == true) {
                    JOptionPane.showMessageDialog(null, "" + e.getNome() + " = Aprovado \n");
                }
                else {
                    JOptionPane.showMessageDialog(null, "" + e.getNome() + " = Reprovado \n");
                }
            }
        }
    }
}
