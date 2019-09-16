import java.io.*;
import java.util.ArrayList;

public class Banco {
    private String caminhoSurf = "src\\Surfistas.txt";
    private String caminhoEtapa = "src\\Etapas.txt";
    private String caminhoPratrocinio = "src\\Patrocinadores.txt";
    private String caminhoJogadores = "src\\Jogadores.txt";
    private ArrayList<Surfista> surfistas = new ArrayList<Surfista>();
    private ArrayList<Etapa> etapas = new ArrayList<Etapa>();
    private ArrayList<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public void salvarSurfista(Surfista pessoa){
        surfistas.add(pessoa);
    }
    public ArrayList<Surfista> consultarSurfista() {
        return surfistas;
    }
    public void atualizarSufista(Surfista velho, Surfista novo){
        for(int i = 0; i < surfistas.size(); i++){
            if(surfistas.get(i).getNome().equals(velho.getNome()) && surfistas.get(i).getNickname().equals(velho.getNickname()) && surfistas.get(i).getIdade() == velho.getIdade() && surfistas.get(i).getNacionalidade().equals(velho.getNacionalidade())){
                surfistas.remove(surfistas.get(i));
                surfistas.add(novo);
                break;
            }
        }
    }
    public void excluirSurfista(Surfista velho){
        for (int i =0; i < surfistas.size(); i++){
            if(surfistas.get(i).getNome().equals(velho.getNome()) && surfistas.get(i).getNickname().equals(velho.getNickname()) && surfistas.get(i).getIdade() == velho.getIdade() && surfistas.get(i).getNacionalidade().equals(velho.getNacionalidade())){
                surfistas.remove(surfistas.get(i));
            }
        }
    }

    public void salvarEtapa(Etapa etapa){
        etapas.add(etapa);
    }
    public ArrayList<Etapa> consultarEtapa(){
        return etapas;
    }
    public void atualizarEtapa(Etapa velha, Etapa nova){
        for(int i = 0; i < etapas.size(); i++){
            if(etapas.get(i).getPraia().equals(velha.getPraia()) && etapas.get(i).getPais().equals(velha.getPais())){
                etapas.remove(etapas.get(i));
                etapas.add(nova);
                break;
            }
        }
    }
    public void excluirEtapa(Etapa velha){
        for(int i = 0; i < etapas.size(); i++){
            if(etapas.get(i).getPais().equals(velha.getPais()) && etapas.get(i).getPraia().equals(velha.getPraia())){
                etapas.remove(etapas.get(i));
                break;
            }
        }
    }

    public void salvarPatrocinio(Patrocinador pessoa){
        patrocinadores.add(pessoa);
    }
    public ArrayList<Patrocinador> consultarPatrocinadores(){
        return patrocinadores;
    }
    public void atualizarPatrocinio(Patrocinador velho, Patrocinador novo){
        for(int i = 0; i < patrocinadores.size(); i++){
            if(patrocinadores.get(i).getMarca().equals(velho.getMarca()) && patrocinadores.get(i).getRepresentante().equals(velho.getRepresentante())){
                patrocinadores.remove(patrocinadores.get(i));
                patrocinadores.add(novo);
                break;
            }
        }
    }
    public void excluirPatrocinio(Patrocinador velho){
        for(int i = 0; i < patrocinadores.size(); i++){
            if(patrocinadores.get(i).getMarca().equals(velho.getMarca()) && patrocinadores.get(i).getRepresentante().equals(velho.getRepresentante())){
                patrocinadores.remove(patrocinadores.get(i));
                break;
            }
        }
    }

    public void salvarJogador(Jogador pessoa){
        jogadores.add(pessoa);
    }
    public ArrayList<Jogador> consultarJogadores(){
        return jogadores;
    }
    public void atualizarJogadores(Jogador velho, Jogador novo){
        for(int i = 0; i < jogadores.size(); i++){
            if(jogadores.get(i).getNome().equals(velho.getNome()) && jogadores.get(i).getLogin().equals(velho.getLogin()) && jogadores.get(i).getSenha().equals(velho.getSenha())){
                jogadores.remove(jogadores.get(i));
                jogadores.add(novo);
                break;
            }
        }
    }
    public void excluirJogador(Jogador velho){
        for(int i = 0; i < jogadores.size(); i++){
            if(jogadores.get(i).getNome().equals(velho.getNome()) && jogadores.get(i).getLogin().equals(velho.getLogin()) && jogadores.get(i).getSenha().equals(velho.getSenha())){
                jogadores.remove(jogadores.get(i));
                break;
            }
        }
    }


    public void salvarTudoSurf() {
        ObjectOutputStream gravarArquivo = null;
        try {
            FileOutputStream arquivo = new FileOutputStream(caminhoSurf);
            gravarArquivo = new ObjectOutputStream(arquivo);
            for (int i = 0; i < surfistas.size(); i++) {
                gravarArquivo.writeObject(surfistas.get(i));
            }
            gravarArquivo.close();
            arquivo.close();
        } catch (IOException e) {
        }
    }

    public void lerTudoSurf(){

        try{
            FileInputStream arquivo = new FileInputStream(caminhoSurf);

            try{
                ObjectInputStream lerArquivo = new ObjectInputStream(arquivo);
                Surfista pessoa;
                while ((pessoa = (Surfista) lerArquivo.readObject())!=null) {
                    surfistas.add(pessoa);
                }
                lerArquivo.close();
                arquivo.close();
            }catch (Exception e){
            }
        }catch (FileNotFoundException e){
            try {
                FileOutputStream arquivo = new FileOutputStream(caminhoSurf);
                ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
                gravarArquivo.close();
                arquivo.close();
            }catch (IOException t){
            }
        }catch (Exception e){
        }
    }

    public void salvarTudoEtapa() {
        ObjectOutputStream gravarArquivo = null;
        try {
            FileOutputStream arquivo = new FileOutputStream(caminhoEtapa);
            gravarArquivo = new ObjectOutputStream(arquivo);
            for (int i = 0; i < etapas.size(); i++) {
                gravarArquivo.writeObject(etapas.get(i));
            }
            gravarArquivo.close();
            arquivo.close();
        } catch (IOException e) {
        }
    }

    public void lerTudoEtapa(){

        try{
            FileInputStream arquivo = new FileInputStream(caminhoEtapa);

            try{
                ObjectInputStream lerArquivo = new ObjectInputStream(arquivo);
                Etapa pessoa;
                while ((pessoa = (Etapa) lerArquivo.readObject())!=null) {
                    etapas.add(pessoa);
                }
                lerArquivo.close();
                arquivo.close();
            }catch (Exception e){
            }
        }catch (FileNotFoundException e){
            try {
                FileOutputStream arquivo = new FileOutputStream(caminhoEtapa);
                ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
                gravarArquivo.close();
                arquivo.close();
            }catch (IOException t){
            }
        }catch (Exception e){
        }
    }

    public void salvarTudoPatrocinio() {
        ObjectOutputStream gravarArquivo = null;
        try {
            FileOutputStream arquivo = new FileOutputStream(caminhoPratrocinio);
            gravarArquivo = new ObjectOutputStream(arquivo);
            for (int i = 0; i < patrocinadores.size(); i++) {
                gravarArquivo.writeObject(patrocinadores.get(i));
            }
            gravarArquivo.close();
            arquivo.close();
        } catch (IOException e) {
        }
    }

    public void lerTudoPatrocinio(){

        try{
            FileInputStream arquivo = new FileInputStream(caminhoPratrocinio);

            try{
                ObjectInputStream lerArquivo = new ObjectInputStream(arquivo);
                Patrocinador pessoa;
                while ((pessoa = (Patrocinador) lerArquivo.readObject())!=null) {
                    patrocinadores.add(pessoa);
                }
                lerArquivo.close();
                arquivo.close();
            }catch (Exception e){
            }
        }catch (FileNotFoundException e){
            try {
                FileOutputStream arquivo = new FileOutputStream(caminhoPratrocinio);
                ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
                gravarArquivo.close();
                arquivo.close();
            }catch (IOException t){
            }
        }catch (Exception e){
        }
    }

    public void salvarTudoJogadores() {
        ObjectOutputStream gravarArquivo = null;
        try {
            FileOutputStream arquivo = new FileOutputStream(caminhoJogadores);
            gravarArquivo = new ObjectOutputStream(arquivo);
            for (int i = 0; i < jogadores.size(); i++) {
                gravarArquivo.writeObject(jogadores.get(i));
            }
            gravarArquivo.close();
            arquivo.close();
        } catch (IOException e) {
        }
    }

    public void lerTudoJogadores(){

        try{
            FileInputStream arquivo = new FileInputStream(caminhoJogadores);

            try{
                ObjectInputStream lerArquivo = new ObjectInputStream(arquivo);
                Jogador pessoa;
                while ((pessoa = (Jogador) lerArquivo.readObject())!=null) {
                    jogadores.add(pessoa);
                }
                lerArquivo.close();
                arquivo.close();
            }catch (Exception e){
            }
        }catch (FileNotFoundException e){
            try {
                FileOutputStream arquivo = new FileOutputStream(caminhoJogadores);
                ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
                gravarArquivo.close();
                arquivo.close();
            }catch (IOException t){
            }
        }catch (Exception e){
        }
    }

}
