import java.util.ArrayList;

public class Negocio {
    Banco banco = new Banco();

    public void ler(){
        banco.lerTudoSurf();
        banco.lerTudoEtapa();
        banco.lerTudoPatrocinio();
        banco.lerTudoJogadores();
    }
    public void salvar(){
        banco.salvarTudoSurf();
        banco.salvarTudoEtapa();
        banco.salvarTudoPatrocinio();
        banco.salvarTudoJogadores();
    }

    public void salvarSurfistas(String nome, String apelido, int idade,String pais){
        Surfista pessoa = new Surfista(nome,apelido,idade,pais);
        banco.salvarSurfista(pessoa);
    }
    public void imprimirSurfistas(){
        ArrayList<Surfista> surfistas = banco.consultarSurfista();
        for (int i = 0; i < surfistas.size(); i++) {
            System.out.println(surfistas.get(i).imprimi());
        }
    }
    public void atualizarSurfistas(String nomev, String nickv, int idadev, String nacionalidadev, String nomen, String nickn, int idaden, String nacionalidaden){
        Surfista velho = new Surfista(nomev,nickv,idadev,nacionalidadev);
        Surfista novo = new Surfista(nomen,nickn,idaden,nacionalidaden);
        banco.atualizarSufista(velho,novo);
    }
    public void excluirSurfistas(String nome, String apelido, int idade,String pais){
        Surfista atual = new Surfista(nome,apelido,idade,pais);
        banco.excluirSurfista(atual);
    }

    public void salvarEtapa(String pais, String praia){
        Etapa n = new Etapa(pais,praia);
        banco.salvarEtapa(n);
    }
    public void imprimirEtapas(){
        ArrayList<Etapa> etapas = banco.consultarEtapa();
        for(int i = 0; i < etapas.size();i++){
            System.out.println(etapas.get(i).imprimir());
        }
    }
    public void atualizarEtapa(String paisv, String praiav, String paisn, String praian){
        Etapa velho = new Etapa(paisv,praiav);
        Etapa novo = new Etapa(paisn,praian);
        banco.atualizarEtapa(velho,novo);
    }
    public void excluirEtapa(String pais, String praia){
        Etapa atual = new Etapa(pais,praia);
        banco.excluirEtapa(atual);
    }

    public void salvarPatrocinio(String marca, String representante){
        Patrocinador n = new Patrocinador(marca,representante);
        banco.salvarPatrocinio(n);
    }
    public void imprimirPatrocinadores(){
        ArrayList<Patrocinador> patrocinadors = banco.consultarPatrocinadores();
        for(int i = 0; i < patrocinadors.size();i++){
            System.out.println(patrocinadors.get(i).imprimir());
        }
    }
    public void atualizarPatrocinio(String marcav, String representantev, String marcan, String representanten){
        Patrocinador velho = new Patrocinador(marcav,representantev);
        Patrocinador novo = new Patrocinador(marcan,representanten);
        banco.atualizarPatrocinio(velho,novo);
    }
    public void excluirPatrocinio(String marca, String representante){
        Patrocinador atual = new Patrocinador(marca,representante);
        banco.excluirPatrocinio(atual);
    }

    public void salvarJogador(String nome, String login, String senha){
        Jogador n = new Jogador(nome,login,senha);
        banco.salvarJogador(n);
    }
    public void imprimirJogadores(){
            ArrayList<Jogador> jogadors = banco.consultarJogadores();
        for(int i = 0; i < jogadors.size();i++){
            System.out.println(jogadors.get(i).imprimir());
        }
    }
    public void atualizarJogador(String nomev, String loginv, String senhav, String nomen, String loginn, String senhan){
        Jogador velho = new Jogador(nomev,loginv,senhav);
        Jogador novo = new Jogador(nomen,loginn,senhan);
        banco.atualizarJogadores(velho,novo);
    }
    public void excluirJogador(String nome, String login, String senha){
        Jogador atual = new Jogador(nome,login,senha);
        banco.excluirJogador(atual);
    }



}
