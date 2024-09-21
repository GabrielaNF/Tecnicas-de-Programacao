import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsandoArquivoBinario {
    public static void main(String[] args) throws IOException {
        
        try { //garante que o problema funciona tentando executar o comando, se nao consegue executar, eh uma excessao, 
              //que passa pra catch
            // FileOutputStream fout = new FileOutputStream("arq1.bin");

            // DataOutputStream dout = new DataOutputStream(fout); //grava tipos primitivos no fout
            //                                                     //dout = array que armazena binarios

            // dout.writeUTF("Ola mundo"); //todo comando write eh obrigatorio tratar excessao do tipo IOException
            // dout.writeInt(17);
            // dout.writeDouble(1024.56);
            // dout.writeBoolean(true);
            // dout.flush();//forca envio da informacao pro arquivo

            // dout.close();
            // fout.close();

            FileInputStream fin = new FileInputStream("arq1.bin");
            DataInputStream din = new DataInputStream(fin);

            String texto = din.readUTF();
            int idade = din.readInt();
            double salario = din.readDouble();
            boolean terminou = din.readBoolean();

        }catch ( Exception e ) {
            System.out.println ("Erro de IO: " + e.getMessage() );
        }


    //     //hierarquia dos erros, do mais especifico pro mais geral
    //     }catch( FileNotFoundException e ) { //catch manda mensagem de erro quando a tentativa encontra excessao, 
    //                                         //se nao encontra excessao, nao realiza o catch
    //         System.out.println("Erro: arquivo nao encontrado ");
    //     }catch ( IOException e ){
    //         System.out.println("Erro de IO");
    //     }
    //     //classe pai de todas as excessoes: Exception ( resolvendo ele, resolve todos os outros )
    }
}

// hierarquia: FileNotFoundException
//             IOException
//             Exception

//Precisa gravar e ler na mesma ordem