package codigos.data;

public class UsandoData { //CLASSE EXECUTAVEL
    
    public static void main(String[] args) {
        
        Data nasc; //declaracao de um objeto
        nasc = new Data(); //instanciacao de um objeto

        nasc.setDia(7); //dia = atributo da classe Data
        nasc.setMes(6);
        nasc.setAno(2002);

        System.out.println (nasc.getDia() + "/" +    nasc.getMes() + "/" +  nasc.getAno());

        System.out.println(nasc.getDataFormatada());

        //----------------------------------------------------------------------------------

        Data natal = new Data();
        natal.setDia(25);
        natal.setMes(12);
        natal.setAno(2024);

        System.out.println(natal); //imprime a posicao de memoria da classe natal
                                   // como foi incluida a getDataFormatada para todas as instancias da classe Data, todas passam a ser escritas assim
    }
 
}
