package codigos;

public class MathEx {
    
    public static void main(String[] args) {
        double result = Math.sqrt(81); //sqrt = raiz

        System.out.println(result);

        double result2 = Math.pow(result, 2); //pow = num elevado a tal potencia

        System.out.println(result + " x " + result + " = " + result2);

        double cat1 = 4; //catetos
        double cat2 = 3;

        double aux =  Math.pow(cat1, 2) + Math.pow(cat2, 2);

        double hypot = Math.sqrt( aux );

         //double hypot = Math.hypot(cat1, cat2); (funcao hypot ja calcula hipotenusa)

        System.out.println("Hypot = " + hypot);

        

    }
}
