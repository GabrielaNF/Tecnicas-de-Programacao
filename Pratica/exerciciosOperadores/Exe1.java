import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exe1 {
    
    public static void main(String[] args){
        notebooks();
    }

    public static void notebooks (){
        int salario = 1412;
        long total = 1000000000;

        double quantidade = (double)total/salario;

        DecimalFormat df = new DecimalFormat("0.00");
        String numeroFormatado = df.format(quantidade);

        JOptionPane.showMessageDialog(null, numeroFormatado);
    }
}