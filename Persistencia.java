import java.io.*;
import java.util.LinkedList;
import java.util.ArrayList;

public class Persistencia {
    
    private FileInputStream fileStream;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private boolean continua = true;
    private boolean moreRecords = true;
    private LinkedList<Aviador> piloto = new LinkedList<>();
    private ArrayList<ExperienciaProfissional> expProfissional = new ArrayList<>();
    private ArrayList<TipoDeAeronave> tAeronave = new ArrayList<>();
    

    public LinkedList<Aviador> getPiloto() {
        return piloto ;
    }

    public boolean getContinua() {
        return continua;
    }

  
public void setupLer(String arquivo) {

    //Abre arquivo para leitura

      try {
            fileStream = new FileInputStream(arquivo);
            input = new ObjectInputStream(fileStream);
        }
      catch (EOFException eof) {
            continua = false; //arquivo está vazio
        }
      catch (IOException e) {
            System.err.println("Falha na Abertura do Arquivo para Leitura\n" + e.toString());
            System.exit(1);
        }
    }
    
    
public void readRecords() {

    //Carrega todo o conteúdo do arquivo na Coleção produto

      try {

        while (moreRecords) {
        piloto.add((Aviador)(input.readObject()));
      
    }

    } catch (EOFException eof) {

         moreRecords = false;

    } catch (IOException e) {

         System.err.println("Erro durante leitura do arquivo\n" + e.toString());
         System.exit(1);


    } catch(ClassNotFoundException d){

         System.err.println("Erro durante leitura do arquivo - Objeto Inválido\n"+ d.toString());
    }
    }

public void cleanupLer() {

//Fechar o arquivo, após ter sido descarregado na coleção

      try {

        input.close();

}     catch (IOException e) {

        System.err.println("Falha no Fechamento do Arquivo durante Leitura\n"+ e.toString());
        System.exit(1);

    }

}

public void setupGravar(String arquivo) {

//Abre arquivo para gravar

      try{

        output = new ObjectOutputStream(new
        FileOutputStream(arquivo, false));

}     catch (IOException e) {

        System.err.println("Falha na Abertura do Arquivo para Gravação\n" + e.toString());
        System.exit(1);
        }
}

public void addRecords1(LinkedList<Aviador> piloto) {

//Carrega toda a coleção no arquivo

     try {
        
        for (Aviador a : piloto) {
        output.writeObject(a);

}

}    catch (IOException e) {
        
        System.err.println("Erro durante gravação no arquivo\n" + e.toString());
        System.exit(1);

    }
}
public boolean isFile(String fileName){ //Esse método serve para criar um novo arquivo caso não exista
    return new File(fileName).isFile(); 
}

public void cleanupGravar() {

//Fechar o arquivo, após todos os objetos terem sido gravados

      try {
        output.flush();
        output.close();

}     catch (IOException e) {

        System.err.println("Falha no Fechamento do Arquivo – Durante Gravação!!\n" + e.toString());
        System.exit(1);

    }

}
}
