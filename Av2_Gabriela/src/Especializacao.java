public class Especializacao extends Estudante {
    
    public Especializacao() {
        super();
    }

    public Especializacao(String nome, int frequencia, int nota) {
        super( nome, frequencia, nota );
    }

    @Override
    public boolean isAprovado() {
        if ( (super.getFrequencia() >= 75) && (super.getNota() >= 70)) {
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Especializacao {" + super.toString() + "Resultado = " + this.isAprovado() + "}";
    }
}
