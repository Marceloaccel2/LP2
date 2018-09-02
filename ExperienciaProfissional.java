import java.io.Serializable;

public class ExperienciaProfissional implements Serializable {
    
    //Experiencia Profissional
    private String dataDeInicio; 
    private String dataDeTermino;
    private String descricaoDaAtividade;
    private String empresa;
    private String cidadeProf;
    private String estado;

    public String getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(String dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public String getDataDeTermino() {
        return dataDeTermino;
    }

    public void setDataDeTermino(String dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    public String getDescricaoDaAtividade() {
        return descricaoDaAtividade;
    }

    public void setDescricaoDaAtividade(String descricaoDaAtividade) {
        this.descricaoDaAtividade = descricaoDaAtividade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCidadeProf() {
        return cidadeProf;
    }

    public void setCidadeProf(String cidadeProf) {
        this.cidadeProf = cidadeProf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
