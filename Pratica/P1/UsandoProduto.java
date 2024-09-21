package P1;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.lang.String;

public class UsandoProduto {
    public static void main(String[] args) {

        ArrayList<ProdutoMercado> cadastros;
        cadastros = new ArrayList<ProdutoMercado>();

        String resposta;
        do {        
            String nome = JOptionPane.showInputDialog("Digite o nome do produto" );
            String quantia = JOptionPane.showInputDialog("Digite a quantidade do produto em L ou Kg");
            double quantidade = Double.parseDouble(quantia);
            String preco = JOptionPane.showInputDialog("Digite o preco do produto");
            double valor = Double.parseDouble(preco);

            ProdutoMercado item;
            item = new ProdutoMercado();

            item.setNome(nome);
            item.setQuantidade(quantidade);
            item.setValor(valor);

            cadastros.add(item);

            resposta = JOptionPane.showInputDialog("Deseja adicionar mais um produto? (s/ n)");
        } while(resposta.equals("s"));

        for(int i=0; i < cadastros.size(); i++){
            JOptionPane.showMessageDialog(null, cadastros.get(i) + " ");
        }
        cadastros.forEach(null);
        ProdutoMercado maisBarato = new ProdutoMercado();

        //<TENTATIVA> da questao 5 
        for(int i=0; i < cadastros.size(); i++){//*quando coloco length da erro
            maisBarato = cadastros.getCustoPorUnidade();
                if(cadastros[i].getCustoPorUnidade() < maisBarato){//queria comparar o cadastro "atual" com o mais barato, mas nao sei
                    maisBarato = cadastros[i].getCustoPorUnidade();
                }
        }

        JOptionPane.showMessageDialog(null, "O produto mais barato eh: " + maisBarato.setNome());
     }
}//fim da classe principal


//CLASSES UTILIZADAS
/**
 * @author Gabriela Fonseca
 * 
 * Classe responsavel por amazenar uma informação de data, separando em dia, mes e ano
 */

class Produto {
    private String nome;
    private double quantidade;

    /**
     * Metodo construtor com 2 parametros
     * @param n informacao correspondente ao nome do produto
     * @param q informacao correspondente a quantidade do produto
     */

     public Produto() {
        this.nome = "";
        this.quantidade = 0;
     }

     public Produto(String n, double q) {
        this.setNome(n);
        this.setQuantidade(q);
     }

     //SETTERS -------------------------------------------------------------------

     public void setNome (String n) {
        this.nome = n;
     }

     public void setQuantidade (double q) {
        this.quantidade = q;
     }

     //GETTERS -----------------------------------------------------------------

     public String getNome(){
        return this.nome;
     }

     public double getQuantidade() {
        return this.quantidade;
     }

    //<TENTATIVA> de metodo que retorna os 4 primeiros caracteres do nome(se tiver 4 ou mais caracteres) + ultima parte do nome 
    public String getNomeProdutoAbrev() {
        String a[] = new String [100];
        for(int i = 0; i < cadastros.length; i++){
            cadastros[i].nome; //acessa os nomes individualemente
                while(nome[j] != " "){ //pega cada caracter do nome
                    a[j] = nome[j];
                }
        }
     }
}

class ProdutoMercado extends Produto {
    private double valor;

    public ProdutoMercado() {
        super();
        this.valor = 0;
     }

    public ProdutoMercado(String n, double q, double valor) {
        super (n, q);
        this.valor = valor;
    }

    public void setValor (double v) {
        this.valor = v;
    }

    public double getValor () {
        return this.valor;
    }

    public double getCustoPorUnidade() {
        double resultado = 0.0;

        DecimalFormat df = new DecimalFormat("00");

        resultado = this.valor/this.getQuantidade();

        return Double.parseDouble( (df.format(resultado)));
    }
}
