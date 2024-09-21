public class Cubo extends Base{ //Cubo eh classe filha de Base

    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cubo() {
        super(); //metodo construtor da classe pai (lado1 e lado2 inicializa com zero)
        this.altura = 0;
    }

    public Cubo( double lado1, double lado2 ) {
        super( lado1, lado2 );
        this.altura = 0;
    }

    public Cubo( double lado1, double lado2, double altura) {
        super(lado1, lado2);
        this.altura = altura;
    }


    @Override
    public double getNumAresta() {
        return 12;
    }

    @Override
    public double getVolume() {
        return super.getArea() * this.altura;
    }

    @Override
    public int getnumFaces() {
        return 6;
    }

    @Override
    public int getnumVertices() {
        return 8;
    }

    @Override
    public String toString() {
        return "Cubo {" + super.toString() + "altura = " + altura + "}";
    } 
    
}
