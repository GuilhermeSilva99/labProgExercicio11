import java.io.Serializable;

public class Patrocinador implements Serializable {
    private String marca, representante;

    public Patrocinador(String marca, String representante){
        this.marca = marca;
        this.representante = representante;
    }

    public String getMarca() {
        return marca;
    }

    public String getRepresentante() {
        return representante;
    }
    public String imprimir(){
        return "Marca: "+marca+" Representante: "+representante;
    }
}
