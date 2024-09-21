public abstract class Base implements AtributosObjSolido { //abstrata pois tem 2 metodos abstratos
 
    private double lado1;
    private double lado2;

    public Base() {
        this.lado1 = 0;
        this.lado2 = 0;
    }

    public Base(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return this.getLado1() * this.getLado2();
    }

    public abstract double getVolume(); //classe abstrata = incompleta, tem que codificar

    public abstract double getNumAresta();

    public abstract int getnumFaces();

    public abstract int getnumVertices();


    @Override //sobrescreve funcao que ja existe
    public String toString() {
        return "Base{" + "lado1= " + lado1 + ", lado2 = " + lado2 + "}";
    }

}