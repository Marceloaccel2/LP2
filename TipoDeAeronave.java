import java.io.Serializable;

public class TipoDeAeronave implements Serializable {
    private String modelo;
    private int capacidade; 
    private int horasDevoo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getHorasDevoo() {
        return horasDevoo;
    }

    public void setHorasDevoo(int horasDevoo) {
        this.horasDevoo = horasDevoo;
    }
    
    
}
