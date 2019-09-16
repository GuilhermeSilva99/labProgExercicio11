import java.io.Serializable;

public class Surfista implements Serializable {
    private String nome, nickname, nacionalidade;
    private int idade;

    public Surfista(String nome, String apelido, int idade,String pais){
        this.nome = nome;
        nickname = apelido;
        this.idade = idade;
        nacionalidade = pais;
    }

    public String salvar(){
        return ""+nome+";"+nickname+";"+idade+";"+nacionalidade+":";
    }
    public String imprimi(){
        return "Nome: "+nome+" NickName: "+nickname+" Idade: "+idade+" Nacionalidade: "+nacionalidade+";";
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}