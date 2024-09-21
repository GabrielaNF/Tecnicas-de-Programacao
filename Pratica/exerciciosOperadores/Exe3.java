import javax.swing.JOptionPane;

public class Exe3 {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator(){
        String numberA = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        int a = Integer.parseInt(numberA);

        String numberB = JOptionPane.showInputDialog(null, "Digite o primeiro numero");
        int b = Integer.parseInt(numberB);

        JOptionPane.showMessageDialog(null, "Soma: " + (a+b));
        JOptionPane.showMessageDialog(null, "Subtracao: " + (a-b));
        JOptionPane.showMessageDialog(null, "Multiplicacao: " + (a*b));
        JOptionPane.showMessageDialog(null, "Divisao: " + (a/b));
    }
}
