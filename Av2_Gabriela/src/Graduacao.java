public class Graduacao extends Estudante {
    
    public Graduacao() {
        super();
    }

    public Graduacao(String nome, int frequencia, int nota) {
        super( nome, frequencia, nota);
    }

    @Override
    public boolean isAprovado() {
        if ( (super.getFrequencia() >= 75) && (super.getNota() >= 60)) {
            return true;
        }

        if ( (super.getFrequencia() >= 65) && (super.getNota() >= 65)) {
            return true;
        }

        if ( (super.getFrequencia() >= 50) && (super.getNota() >= 80)) {
            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Graduacao {" + super.toString() + "Resultado = " + this.isAprovado() + "}";
    }
}
