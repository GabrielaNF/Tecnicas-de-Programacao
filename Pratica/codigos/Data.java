package codigos;

//Classe Data


import java.text.DecimalFormat;

/**
 * @author Robison Cris Brito
 * 
 * Classe responsável por armazenar uma informação temporal de data,
 * com os dados dividos em dia, mês e ano
 */
public class Data {
    
    private int dia;
    private int mes; 
    private int ano;
    
    /**
     * Método construtor sem parâmetro, o qual valoriza os atributos da 
     * intância com dia = 1, mês igual a janeiro e ano = 2024
     */
    public Data() {
        this.dia = 1 ;
        this.mes = 1 ;
        this.ano = 2024;
    } 
    
    /**
     * Método construtor com três parâmetros, este já valoriza com uma data inicial
     * @param d informação que corresponde ao dia, se dia for menor que um e maior do que 31, este é valorizado com 1
     * @param m informação que corresponde ao mês, se mês for menor que um e maior do que 12, este é valorizado com 1
     * @param a informação que corresponde ao ano, sem validação
     */
    public Data( int d, int m, int a ) {
        this.setDia( d );
        this.setMes( m );
        this.setAno( a );
    }
    
    /**
     * Método responsável por atribuir um dia a data
     * @param d informação que corresponde ao dia, se dia for menor que um e maior do que 31, este é valorizado com 1
     */
    public void setDia( int d ) {
        if( d >=1 && d <= 31 ) {
            this.dia = d;
        } else {
            this.dia = 1;
        }
    }
    
    /**
     * Método responsável por atribuir um mês a data
     * @param m informação que corresponde ao mês, se mês for menor que um e maior do que 12, este é valorizado com 1
     */
    public void setMes( int m ) {
        if( m >=1 && m <= 12 ) {
            this.mes = m;
        } else {
            this.mes = 1;
        }
    }
    
    /**
     * Método responsável por atribuir um ano a data
     * @param ano informação que corresponde ao ano, sem validação
     */
    public void setAno( int ano ) {
        this.ano = ano;
    }
    
    /**
     * Método responsável por recuperar o dia da data
     * @return O dia armazenado na instância da data
     */
    public int getDia() {
        return this.dia;
    }
    
    /**
     * Método responsável por recuperar o mês da data
     * @return O mês armazenado na instância da data
     */
    public int getMes() {
        return this.mes;
    }
    
    /**
     * Método responsável por recuperar o ano da data
     * @return O ano armazenado na instância da data
     */
    public int getAno() {
        return this.ano;
    }
    
    /**
     * Método que retorna uma data formatada como um String
     * @return retorna a data formatada, em dia numérico, mês por extenso e ano numérico
     */
    public String getDataFormatada() {
        String retorno = "";
        
        DecimalFormat df = new DecimalFormat( "00" );
        
        String meses[] = { "janeiro", "fevereiro", "março", "abril",
            "maio", "junho", "julho", "agosto", "setembro", "outubro",
            "novembro", "dezembro" 
        };
        
        retorno = df.format( this.dia ) + " de " + meses[this.mes-1] + " de " + 
                this.ano;
        
        return retorno;
        
    }
    
    public int getDataAAAAMMDD() {
        
        DecimalFormat df = new DecimalFormat( "00" );
        
        return Integer.parseInt( this.ano + "" + df.format(this.mes) + "" + 
                df.format( this.dia ) );
                                  
                
    }
    
    /**
     * Representação textual da instância. 
     * @return retorna a data formatada, em dia numérico, mês por extenso e ano numérico
     */
    @Override
    public String toString() {
        return this.getDataFormatada();
    }
    
    
}


//Classe Feriado
public class Feriado extends Data {
    
    private String descricao;

    public Feriado() {
        super();
        this.descricao = "";
    }

    public Feriado(int d, int m, int a) {
        super(d, m, a);
        this.descricao = "";
    }

    public Feriado(int d, int m, int a, String descricao) {
        super(d, m, a);
        this.descricao = descricao;
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDataFormatada() {
        return super.getDataFormatada() + " - " + this.descricao; 
    }

    @Override
    public String toString() {
        return this.getDataFormatada();
    }

    @Override
    public int getDataAAAAMMDD() {
        return super.getDataAAAAMMDD(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

///Classe usa data cadastrando datas

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class UsandoData {

    public static void main(String[] args) {
 
        String continua = "S";
        
        ArrayList<Data> registros = new ArrayList<Data>();
        
        do {
            
            String dataStr = JOptionPane.showInputDialog( "Digite a Data(dd/mm/aaaa)" );
            //17/4/2024 
            String parte[] = dataStr.split( "/" );
            
            int dia = Integer.parseInt( parte[0] );
            int mes = Integer.parseInt( parte[1] );
            int ano = Integer.parseInt( parte[2] );
            
            Data data = new Data( dia, mes, ano );
            registros.add( data );
            
            continua = JOptionPane.showInputDialog( "Continua (S/N)" );
            
        } while ( continua.equalsIgnoreCase( "S" ) );
        
        System.out.println( registros );
        
        int menorData = 99999999;
        Data menorDataObj = null;
        
        
        for( Data data : registros ) {
            if ( menorData > data.getDataAAAAMMDD() ) {
                menorData = data.getDataAAAAMMDD();
                menorDataObj = data;
            }
        }
        
        JOptionPane.showMessageDialog( null, "Menor Data: " + menorDataObj.getDataFormatada() );
        
    }
    
}

//Classe Usando data apresentando componentes visuais e gravando arquivo binário

import java.awt.Button;
import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsandoData {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Frame janela = new Frame( "Título da Janela" );
        
        Button botao = new Button( );
        botao.setLabel( "OK" );
        
        
        janela.add( botao );
        
        janela.setSize( 640, 480 );
        janela.setVisible( true );
        
        
        FileOutputStream arquivo = new FileOutputStream( "arquivo.txt" );
        arquivo.write( new byte[] { 'a', 'b' } );
        arquivo.close();
 
    }
    
}

