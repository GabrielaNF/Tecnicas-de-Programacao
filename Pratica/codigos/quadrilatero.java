package codigos;

public public class Main {
    public static void main(String args[] ) {

        Quadrilatero q1 = new Quadrilatero();
        q1.setLado1( 1 );
        q1.setLado2( 2 );
        System.out.println( q1.getLado1() + " - " + q1.getLado2() );

        Quadrilatero q2 = new Quadrilatero();
        System.out.println( q2.getLado1() + " - " + q2.getLado2() );

        Quadrilatero q3 = new Quadrilatero( 3, 3 );
        System.out.println( q3.getLado1() + " - " + q3.getLado2() + 
                           " - " + q3.isFaceQuadrada() + " - " + 
                          q3.getArea() );

        Quadrilatero q4 = new Quadrilatero( 3, 4 );
        System.out.println( q4.toString() );

        Paralelepipedo p1 = new Paralelepipedo();
        p1.setLado1( 2 );
        p1.setLado2( 2 );
        p1.setProfundidade( 2 );
        System.out.println( p1.toString() );
        
 
    } //fim do public static void main()
    
} //fim da classe Main

class Quadrilatero {
    private int lado1;
    private int lado2;

    public Quadrilatero() {
        this.lado1 = 0;
        this.lado2 = 0;
    }

    public Quadrilatero( int lado1, int lado2 ) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setLado1( int lado1 ) {
        this.lado1 = lado1;
    }

    public void setLado2( int lado2 ) {
        this.lado2 = lado2;
    }

    public int getLado1() {
        return this.lado1;
    }

    public int getLado2() {
        return this.lado2;
    }

    public boolean isFaceQuadrada() {
        return this.lado1 == this.lado2;
    }

    public int getArea() {
        return this.lado1 * this.lado2;
    }

    @Override
    public String toString() {
        return "Lado1: " + this.lado1 + " - " + 
            "Lado2: " + this.lado2 + " - " +
            "Eh Quadrado: " + this.isFaceQuadrada() + " - " +
            "Área: " + this.getArea();
    }
} //fim da classe Quadrilatero


class Paralelepipedo extends Quadrilatero {
    private int profundidade;
    
    public Paralelepipedo() {
        super();
        this.setProfundidade( 0 );
    }

    public Paralelepipedo( int lado1, int lado2 ) {
        super( lado1, lado2 );
        this.setProfundidade( 0 );
    }

    public Paralelepipedo( int lado1, int lado2, int profundidade ) {
        super( lado1, lado2 );
        this.setProfundidade( profundidade );
    }

    public void setProfundidade( int profundidade ) {
        this.profundidade = profundidade;
    }

    public int getProfundidade() {
        return this.profundidade;
    }

    public boolean isCubo() {
        return super.getLado1() == this.getProfundidade() &&
            super.isFaceQuadrada();
    }

    public int getVolume() {
        return super.getLado1() * super.getLado2() * 
            this.getProfundidade();
    }

    @Override
    public int getArea() {
        return ( 2 * super.getArea() ) +
            ( 2 * super.getLado2() * this.getProfundidade() ) + 
            ( 2 * super.getLado1() * this.getProfundidade() );
    }

    @Override
    public String toString() {
        return "Lado1: " + super.getLado1() + " - " + 
            "Lado2: " + super.getLado2() + " - " +
            "Profundidade: " + this.profundidade + " - " +
            "Eh Face Quadrado: " + super.isFaceQuadrada() + " - " +
            "Eh Cubo: " + this.isCubo() + " - " +
            "Área: " + this.getArea(); 
    }

    
}
 {
    
}
