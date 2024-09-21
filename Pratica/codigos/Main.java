package codigos;

public import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Data> registros; //declarar um objeto do tipo ArrayList
        registros = new ArrayList<Data>(); //instancia o objeto
        
        Data hoje; //Declaracao de um objeto
        hoje = new Data(); //instanciação de um objeto
        
        hoje.setDia( 1 );
        hoje.setMes( 4 );
        hoje.setAno( 2024 );
        
        System.out.println(hoje.getDia() + "/" + 
                hoje.getMes() + "/" + hoje.getAno() );

        registros.add( hoje );
        
        
        //------
        Data nasc = new Data();
        
        nasc.setDia( 7 );
        nasc.setMes( 3 );
        nasc.setAno( 1981 );
        
        System.out.println( nasc.getDataFormatada() );

        registros.add( nasc );
        
        //--------
        
        Data natal = new Data();
        natal.setDia( 25 );
        natal.setMes( 12 );
        natal.setAno( 2024 );
        
        System.out.println( natal );

        registros.add( natal );
        
        //--------
        Data confraternizacaoUniversal = new Data();
        
        System.out.println( confraternizacaoUniversal.getDia() + "/" +
                confraternizacaoUniversal.getMes() + "/" + 
                confraternizacaoUniversal.getAno() );

        registros.add( confraternizacaoUniversal );
        
        //--------
        
        Data pascoa = new Data( 31, 3, 2024 );
        
        System.out.println( pascoa.getDataFormatada() );

        registros.add( pascoa );


        //-----

        Feriado diaDoTrabalho = new Feriado( 1, 5, 2024, "Dia do Trabalho" );

        System.out.println( diaDoTrabalho.getDataFormatada() );

        registros.add( diaDoTrabalho );

        //-----

        Feriado corpusChrist = new Feriado();
        corpusChrist.setDia( 30 );
        corpusChrist.setMes ( 5 );
        corpusChrist.setAno( 2024 );
        corpusChrist.setDescricao( "Corpus Christi" );
        
        System.out.println( corpusChrist );

        registros.add( corpusChrist );

        System.out.println( "\n\n\n" );

        System.out.println( "Tamanho do registros: " + registros.size() );

        System.out.println( "Todos os elementos" );
        System.out.println( "===================================" );

        for( Data aux : registros ) {
            //Data aux = registros.get( i );
            
            System.out.println( aux );
        }

        registros.forEach(null);

        
    } //fim do public static void main
    
} //fim da class principal (Main.java)

class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        this.dia = 1 ;
        this.mes = 1;
        this.ano = 2024;
    }//fim construtor sem parametro
    
    public Data( int d, int m, int a ) {
        this.setDia( d );
        this.setMes( m );
        this.setAno( a );
    }//fim do contrutor com parametro
    
    public void setDia( int d ) {
        if( d >=1 && d <= 31 ) {
            this.dia = d;
        } else {
            this.dia = 1;
        }
    }
    
    public void setMes( int m ) {
        if( m >=1 && m <= 12 ) {
            this.mes = m;
        } else {
            this.mes = 1;
        }
    }
    
    public void setAno( int ano ) {
        this.ano = ano;
    }
    
    public int getDia() {
        return this.dia;
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public int getAno() {
        return this.ano;
    }
    
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
    
    @Override
    public String toString() {
        return this.getDataFormatada();
    }
    
} //fim da classe Data 


class Feriado extends Data {

    private String descricao;

    public Feriado() {
        super();//chama o construtor da classe pai, sem parâmetro
        this.descricao = "Confraternizacao Universal";
    } 

    public Feriado(int d, int m, int a ) {
        super( d, m, a );//chama o construtor da classe pai, com parâmetro
        this.descricao = "";
    } 

    public Feriado( int d, int m, int a, String desc ) {
        super( d, m, a ); //chama o construtor da classe pai, com parâmetro
        this.descricao = desc;
    }

    public void setDescricao( String d ) {
        this.descricao = d;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String getDataFormatada() {
       return super.getDataFormatada() + " - " + this.descricao; 
    }

    @Override
    public String toString() {
        return this.getDataFormatada();
    }

} //fim da classe Feriado