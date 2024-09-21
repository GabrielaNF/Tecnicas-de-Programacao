public class Piramide extends Base{ //Piramide eh classe filha de Base

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Piramide() {
        super(); //metodo construtor da classe pai (lado1 e lado2 inicializa com zero)
        this.altura = 0;
    }

    public Piramide( double lado1, double lado2 ) {
        super( lado1, lado2 );
        this.altura = 0;
    }

    public Piramide( double lado1, double lado2, double altura) {
        super(lado1, lado2);
        this.altura = altura;
    }


    @Override
    public double getNumAresta() {
        return 5;
    }

    @Override
    public double getVolume() {
        return (super.getArea() * this.altura)/3;
    }

    @Override
    public int getnumFaces() {
        return 5;
    }

    @Override
    public int getnumVertices() {
        return 8;
    }

    @Override
    public String toString() {
        return "Piramide {" + super.toString() + "altura = " + altura + "}";
    } 
    
}
