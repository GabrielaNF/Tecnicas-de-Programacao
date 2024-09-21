import java.lang.Math;

public class FuncoesMatematicas {

    public static int getFatorial (int num){ //tem que ser estatico para poder usar diretamente nas outras classes
        int aux = 1;

        for (int i = num; i > 1; i --){
            aux = aux * i;
        }
        return aux;
    }

    public static String getBaskara (double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return "x1 = " + x1 + "x2 = " + x2;
    }
}
