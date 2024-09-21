import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RevisaoPrincipal { //cadastro de figuras geometricas
    public static void main(String[] args) {
        String continua = "S";

        ArrayList<Base>registros = new ArrayList<Base>(); //arraylist guarda do tipo Base

        do {
            String tipo = JOptionPane.showInputDialog(null, "Cubo(C) ou Piramide(P)?");
            
            if (tipo.equalsIgnoreCase("C")) {
                String entrada = JOptionPane.showInputDialog(null, "Digite as medidadas l1, l2 e altura");
                
                String partes[] = entrada.split(" ");
                
                try{ 
                    Cubo c = new Cubo ( Integer.parseInt(partes[0]),
                    Integer.parseInt(partes[1]),
                    Integer.parseInt(partes[2]));

                    registros.add( c );
                } catch( NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Informado NAN");
                    return;
                }
                
            }else if ( tipo.equalsIgnoreCase( "P") ) {
                String entrada = JOptionPane.showInputDialog(null, "Digite as medidadas l1, l2 e altura");

                String partes[] = entrada.split(" ");

                Piramide p = new Piramide ( Integer.parseInt(partes[0]),
                Integer.parseInt(partes[1]),
                Integer.parseInt(partes[2]));

                registros.add( p );
            }

            continua = JOptionPane.showInputDialog(null, "Deseja continuar?");
        }while( continua.equalsIgnoreCase("s"));

            for(int i = 0; i < registros.size(); i++) {
                Base b = registros.get(i); //arraylist retorna Base / Recupera uma base

                String msg = "";


                if ( b instanceof Cubo ) { //se entrou nesse if eh porque b eh um cubo
                    msg = "Cubo: ";

                    Cubo c = (Cubo) b; //Recupera Cubo (sai de Base e vira Cubo)
                    msg += "Faces: " + c.getnumFaces() + " " +
                            "Aresta: " + c.getNumAresta() + " " +
                            "Vertices: " + c.getnumVertices() + " " +
                            "Volume: " + c.getVolume();
                }

                else if ( b instanceof Piramide) {
                    msg = "Piramide: ";

                    Piramide p = (Piramide) b;
                    msg += "Faces: " + p.getnumFaces() + " " +
                            "Aresta: " + p.getNumAresta() + " " +
                            "Vertices: " + p.getnumVertices() + " " +
                            "Volume: " + p.getVolume();
                }

                JOptionPane.showMessageDialog(null, msg);
            }
    }
}
