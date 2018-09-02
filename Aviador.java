import java.io.Serializable;
import java.util.ArrayList;

public class Aviador implements Serializable {

    //Dados Pessoais
    private String nomeDoAviador;
    private String endereco;
    private String fone;
    private String email;
    private long numeroBreve; // numero do Brevê
    private long registroProf;
    
    
    private ArrayList<ExperienciaProfissional> expProfissional;
    private ArrayList<TipoDeAeronave> tAeronave;
    //Titulação    
    private int anoDeConclusao;
    private String nomeDaInstituicao;
    private String cidade;
    private String uf;
    
    

    //Construtor
    public Aviador(String nomeDoAviador, String endereco, String fone, String email, long numeroBreve, long registroProf, int anoDeConclusao, String nomeDaInstituicao, String cidade, String uf, ArrayList<ExperienciaProfissional> expProfissional , ArrayList<TipoDeAeronave> tAeronave) {
        this.nomeDoAviador = nomeDoAviador;
        this.endereco = endereco;
        this.fone = fone;
        this.email = email;
        this.numeroBreve = numeroBreve;
        this.registroProf = registroProf;
        this.anoDeConclusao = anoDeConclusao;
        this.nomeDaInstituicao = nomeDaInstituicao;
        this.cidade = cidade;
        this.uf = uf;
        
        this.expProfissional = expProfissional;        //EXPERIENCIA PROFISSIONAL
        this.tAeronave = tAeronave;                    //Tipo de Aeronave Apta a Pilotar
      
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 // GET E SET EXP PROFISSIONAL

    public ArrayList<ExperienciaProfissional> getExpProfissional() {
        return expProfissional;
    }

    public void setExpProfissional(ArrayList<ExperienciaProfissional> expProfissional) {
        this.expProfissional = expProfissional;
    }
    
        
// GET E SET TIPO DE AERONAVE

    
    public ArrayList<TipoDeAeronave> getTAeronave(){
        return tAeronave;
    }
    public void setTAeronave(ArrayList<TipoDeAeronave> tAeronave){
        this.tAeronave= tAeronave;
    }
    
    
 
    //Getters e Setters
    public String getNomeDoAviador() {
        return nomeDoAviador;
    }

    public void setNomeDoAviador(String nomeDoAviador) {
        this.nomeDoAviador = nomeDoAviador;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumeroBreve() {
        return numeroBreve;
    }

    public void setNumeroBreve(long numeroBreve) {
        this.numeroBreve = numeroBreve;
    }

    public long getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(long registroProf) {
        this.registroProf = registroProf;
    }

    public int getAnoDeConclusao() {
        return anoDeConclusao;
    }

    public void setAnoDeConclusao(int anoDeConclusao) {
        this.anoDeConclusao = anoDeConclusao;
    }

    public String getNomeDaInstituiçao() {
        return nomeDaInstituicao;
    }

    public void setNomeDaInstituicao(String nomeDaInstituicao) {
        this.nomeDaInstituicao = nomeDaInstituicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }    
} //End of Class
