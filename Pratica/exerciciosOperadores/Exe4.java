import javax.swing.JOptionPane;

public class Exe4 {
    
    public static void main(String[] args) {
        conta();
    }

    public static void conta() {
        String impulsos = JOptionPane.showInputDialog("Digite a quantidade de impulsos: ");
        int pulses = Integer.parseInt(impulsos);

        String chamadas = JOptionPane.showInputDialog("Digite a quantidade de chamadas: ");
        int calling = Integer.parseInt(chamadas);

        double signature = 32.00;
        double p = 0.09;
        double c = 0.35;

        double bill = signature;

        if(pulses>90){
            bill = signature + ((pulses-90)*p);
        }

        double calls = c*calling;

        bill += calls;

        JOptionPane.showMessageDialog(null, bill);
        
    }
}
