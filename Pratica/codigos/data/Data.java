package codigos.data;

import java.text.DecimalFormat;

/**
 * @author Gabriela Fonseca
 * 
 * Classe responsavel por amazenar uma informação de data, separando em dia, mes e ano
 */
//Este eh um Javadoc

public class Data {
    private int dia; //atributos/ caracteristicas das classes
    private int mes;
    private int ano;

    public Data() { //metodo construtor tem que ser o primeiro, pois se o construtor nao tiver parametro, tem pelo menos uma forma de controle pra ele
        setDia(1);
        setMes(1);
        setAno(2024);
    }

    /**
     * Metodo construtor com 3 parametros
     * @param d informacao correspondente ao dia
     * @param m informacao correspondente ao mes
     * @param a informacao correspondente ao ano
     */

    public Data(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }

    //SETTERS ------------------------------------------------------------------

    public void setDia (int d){
        if (d >= 1 && d <= 31){
            dia = d;
        }
        else{
            dia = 1;
        }
    }

    public void setMes (int m){
        if (m >= 1 && m <= 12){
            mes = m;
        }
        else{
            mes = 1;
        }
    }

    public void setAno (int a){
        ano = a;
    }

    //GETTERS ----------------------------------------------------------------

    public int getDia() {
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getDataFormatada(){
        String retorno = "";
        DecimalFormat df = new DecimalFormat("00");//numero de 2 digitos, se nao tiver, ele completa com 0. Ex. 1 = 01

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        retorno = df.format (dia) + " de " + meses[mes-1] + " de " + ano;

        return retorno;
    }

    public Feriado (int d, int m, int a, String desc){
        super(d, m, a);//chama o construtor da classe pai, com parametros
        this.descricao = "confreternizacao"
    }

    public Feriado(){
        super();//chama o construtor da classe pai, sem parametros
    }

    /**
     * Representacao textual da instancia
     * @return retorna a data formatada, em dia numerico, mes por extenso e no numerico.
     */
        
    @Override //sobrescreveu o codigo da classe pai to String pra se comportar do jeito que voce preferir
    public String toString() {
        return getDataFormatada(); //toda instancia da classe Data vai ser convertida para string
                                    //toda vez que precisar converter pra texto, ele vai pra string
    }
}
