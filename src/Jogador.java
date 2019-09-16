import java.io.Serializable;

public class Jogador implements Serializable {
    private String nome, login, senha;

    public Jogador(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }
    public String imprimir(){
        return "Nome: "+nome+" Login: "+login+" Senha:"+senha;
    }
}
