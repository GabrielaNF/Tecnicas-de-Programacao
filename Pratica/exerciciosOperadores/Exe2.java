import javax.swing.JOptionPane;

public class Exe2 {
    public static void main (String[] args){
        calculus();
    }

    public static void calculus(){
        float e = 5*4-2+15/3;
        float f = (10 + 8 / 4 - (1+1) * 2 * 3) + (4*3 + (10+(2*6)));
        boolean g = 3 * 5 % 4 <= 3*2 / 0.5;

        int a = 5;
        int b = 10;
        int c = 1;
        boolean d = (a != b) && (b >= c) && ( (c < a) || (b < c));

        JOptionPane.showMessageDialog(null, e + "\n" + f + "\n" + g + "\n" + d);
    }
}
