public abstract class Estudante implements EstudanteInterface{
    
    private String nome;
    private int frequencia;
    private int nota;

    public Estudante() {
        this.nome = " ";
        this.frequencia = 0;
        this.nota = 0;
    }

    public Estudante (String nome, int frequencia, int nota) {
        this.nome = nome;
        this.frequencia = frequencia;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public abstract boolean isAprovado();

    @Override
    public String toString() {
        return "Estudante{" + "Nome: " + nome + "Frequencia: " + frequencia + "Nota: " + nota + "}";
    }
}
