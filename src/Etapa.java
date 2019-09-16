import java.io.Serializable;

public class Etapa implements Serializable {
    private String pais,praia;

    public Etapa(String pais, String praia){
        this.pais = pais;
        this.praia = praia;
    }

    public String getPais() {
        return pais;
    }

    public String getPraia() {
        return praia;
    }
    public String imprimir(){
        return "Pais: "+pais+" Praia: "+praia;
    }
}
