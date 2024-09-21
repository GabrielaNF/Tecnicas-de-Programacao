import java.text.DecimalFormat;

/**
 * @author isaque
 * 
 * Classe reponsável por armazenar a data com os dados divididos em dia, mês e ano
 */

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    /**
     * Método construtor sem parâmetro, o qual valoriza os atributos da instância com dia = 1, mês = janeiro e ano = 2024
     */
    public Data(){
        setDia(1);
        setMes(1);
        setAno(2024);
    }
    
    /**
     * Método construtor com três parâmetros, este já valoriza com uma data inicial
     * @param d informação que conrresponde ao dia, se dia for menor que zero e maior do que 31, o este é valorizado com 1
     * @param m informação que conrresponde ao mês, se mês for menor que um e maior que 31, este é valorizado com 1
     * @param a informação que corresponde ao ano, sem validação
     */
    public Data(int d, int m, int a){
        setDia(d);
        setMes(m);
        setAno(a);
    }
    
    /**
     * Método responsável por atribuir um dia a data
     * @param d informação que conrresponde ao dia, se dia for menor que zero e maior do que 31, o este é valorizado com 1
     */
    public void setDia(int d){
        if(d >= 1 && d <= 31){
            dia  = d;
        }else{
            dia =1;
        }
    }
    
    /**
     * Método responsável por atribuir um mês a data
     * @param m informação que conrresponde ao mês, se mês for menor que um e maior que 31, este é valorizado com 1
     */
    public void setMes(int m){
        if(m >= 1 && m <= 12){
            mes  = m;
        }else{
            mes = 1;
        }
    }
    
    /**
     * Método responsável por atribuir um ano a data
     * @param a informação que corresponde ao ano, sem validação
     */
    public void setAno(int a){
        ano = a;
    }
    
    /**
     * Método responsável por recuperar o dia da data
     * @return O dia armazenando na instância da data
     */
    public int getDia(){
        return dia;
    }
    
    /**
     * Método responsável por recuperar o mês da data
     * @return O mês armazenado n instância da data
     */
    public int getMes(){
        return mes;
    }
    
    /**
     * Método responsável por recuperar o ano da data
     * @return O ano armazenado na instância da data
     */
    public int getAno(){
        return ano;
    }
    
    /**
     * Método retorna uma data formatada como uma String por extenso
     * @return retorna a data formatada, em dia numérico, mês por extenso e ano numérico
     */
    public String getDataFormatada(){
        String retorno = "";
        
        DecimalFormat df = new DecimalFormat("00");
        
        String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        
        retorno = df.format(dia) + " de " + meses[mes-1] + " de " + ano;
        
        return retorno;
    } 

    public int getDataAAAAMMDD() {
        DecimalFormat df = new DecimalFormat ("00"); //dia e mes menores que 10 vao ter o 0 na frente (04, 06)
        return Integer.parseInt(this.ano + "" + df.format(this.mes) + "" + df.format(this.dia));
    }
    
    /**
     * Repesentação textual da instância
     * @return retorna a data formatada, em dia mês e ano numericos separados por "/"
     */
    @Override
    public String toString(){
        return this.getDataFormatada();
    }

}
