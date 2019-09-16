import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Negocio negocio = new Negocio();
        negocio.ler();
        Scanner ler = new Scanner(System.in);
        int opcao = 0;
        int menu = 0;
        while (opcao != 5) {
            System.out.println("1- Cadastrar Surfista (Nome, NickName, Idade, Nacionalidade)\n" +
                    "2- Cadastrar Etapa (País, Nome da Praia)\n" +
                    "3- Cadastrar Patrocinadores (Nome da Marca, Nome do Representante)\n" +
                    "4- Cadastrar Jogadores (Nome, Login, Senha) Obs 2.: São os jogadores (Usuários)\n" +
                    "5- Sair");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("1- Cadastrar Surfista\n" +
                            "\n" +
                            "        1- Salvar\n" +
                            "        2- Consultar\n" +
                            "        3- Atualizar\n" +
                            "        4- Excluir");

                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            ler.nextLine();
                            System.out.println("Nome:");
                            String nome = ler.nextLine();
                            System.out.println("NickName:");
                            String nick = ler.nextLine();
                            System.out.println("Idade:");
                            int idade = ler.nextInt();
                            ler.nextLine();
                            System.out.println("Nacionalidade:");
                            String nacionalidade = ler.nextLine();
                            negocio.salvarSurfistas(nome,nick,idade,nacionalidade);
                            break;
                        case 2:
                            negocio.imprimirSurfistas();
                            break;
                        case 3:
                            ler.nextLine();
                            System.out.println("Digite as informações do sufista");
                            System.out.println("Nome:");
                            String nomev = ler.nextLine();
                            System.out.println("NickName:");
                            String nickv = ler.nextLine();
                            System.out.println("Idade:");
                            int idadev = ler.nextInt();
                            ler.nextLine();
                            System.out.println("Nacionalidade:");
                            String nacionalidadev = ler.nextLine();
                            System.out.println("\nDigite as novas informações do sufista");
                            System.out.println("Nome:");
                            String nomen = ler.nextLine();
                            System.out.println("NickName:");
                            String nickn = ler.nextLine();
                            System.out.println("Idade:");
                            int idaden = ler.nextInt();
                            ler.nextLine();
                            System.out.println("Nacionalidade:");
                            String nacionalidaden = ler.nextLine();
                            negocio.atualizarSurfistas(nomev,nickv,idadev,nacionalidadev,nomen,nickn,idaden,nacionalidaden);
                            break;
                        case 4:
                            ler.nextLine();
                            System.out.println("Nome:");
                            String nomea = ler.nextLine();
                            System.out.println("NickName:");
                            String nicka = ler.nextLine();
                            System.out.println("Idade:");
                            int idadea = ler.nextInt();
                            ler.nextLine();
                            System.out.println("Nacionalidade:");
                            String nacionalidadea = ler.nextLine();
                            negocio.excluirSurfistas(nomea,nicka,idadea,nacionalidadea);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("2- Cadastrar Etapa\n" +
                            "\n" +
                            "        1- Salvar\n" +
                            "        2- Consultar\n" +
                            "        3- Atualizar\n" +
                            "        4- Excluir");
                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            ler.nextLine();
                            System.out.println("Pais:");
                            String pais = ler.nextLine();
                            System.out.println("Praia:");
                            String praia = ler.nextLine();
                            negocio.salvarEtapa(pais,praia);
                            break;
                        case 2:
                            negocio.imprimirEtapas();
                            break;
                        case 3:
                            ler.nextLine();
                            System.out.println("Digite as informações do etapa");
                            System.out.println("Pais:");
                            String paisv = ler.nextLine();
                            System.out.println("Praia:");
                            String praiav = ler.nextLine();

                            System.out.println("\nDigite as novas informações da etapa");
                            System.out.println("Pais:");
                            String paisn = ler.nextLine();
                            System.out.println("Praia:");
                            String praian = ler.nextLine();
                            negocio.atualizarEtapa(paisv,praiav,paisn,praian);
                            break;
                        case 4:
                            ler.nextLine();
                            System.out.println("Pais:");
                            String paisa = ler.nextLine();
                            System.out.println("Praia:");
                            String praiaa = ler.nextLine();
                            negocio.excluirEtapa(paisa,praiaa);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Cadastrar Patrocinadores\n" +
                            "\n" +
                            "        1- Salvar\n" +
                            "        2- Consultar\n" +
                            "        3- Atualizar\n" +
                            "        4- Excluir");
                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            ler.nextLine();
                            System.out.println("Marca:");
                            String marca = ler.nextLine();
                            System.out.println("Representante:");
                            String representante = ler.nextLine();
                            negocio.salvarPatrocinio(marca,representante);
                            break;
                        case 2:
                            negocio.imprimirPatrocinadores();
                            break;
                        case 3:
                            ler.nextLine();
                            System.out.println("Digite as informações do patrocinio");
                            System.out.println("Marca:");
                            String marcav = ler.nextLine();
                            System.out.println("Representante:");
                            String representantev = ler.nextLine();

                            System.out.println("\nDigite as novas informações do patrocinio");
                            System.out.println("Marca:");
                            String marcan = ler.nextLine();
                            System.out.println("Representante:");
                            String representanten = ler.nextLine();
                            negocio.atualizarPatrocinio(marcav,representantev,marcan,representanten);
                            break;
                        case 4:
                            ler.nextLine();
                            System.out.println("Marca:");
                            String marcaa = ler.nextLine();
                            System.out.println("Representante:");
                            String representantea = ler.nextLine();
                            negocio.excluirPatrocinio(marcaa,representantea);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Cadastrar Jogadores\n" +
                            "\n" +
                            "        1- Salvar\n" +
                            "        2- Consultar\n" +
                            "        3- Atualizar\n" +
                            "        4- Excluir");

                    menu = ler.nextInt();
                    switch (menu){
                        case 1:
                            ler.nextLine();
                            System.out.println("Nome:");
                            String nome = ler.nextLine();
                            System.out.println("Login:");
                            String login = ler.nextLine();
                            System.out.println("Senha:");
                            String senha = ler.nextLine();
                            negocio.salvarJogador(nome,login,senha);
                            break;
                        case 2:
                            negocio.imprimirJogadores();
                            break;
                        case 3:
                            ler.nextLine();
                            System.out.println("Digite as informações do jogador");
                            System.out.println("Nome:");
                            String nomev = ler.nextLine();
                            System.out.println("Login:");
                            String loginv = ler.nextLine();
                            System.out.println("Senha:");
                            String senhav = ler.nextLine();

                            System.out.println("\nDigite as novas informações do jogador");
                            System.out.println("Nome:");
                            String nomen = ler.nextLine();
                            System.out.println("Login:");
                            String loginn = ler.nextLine();
                            System.out.println("Senha:");
                            String senhan = ler.nextLine();
                            negocio.atualizarJogador(nomev,loginv,senhav,nomen,loginn,senhan);
                            break;
                        case 4:
                            ler.nextLine();
                            System.out.println("Nome:");
                            String nomea = ler.nextLine();
                            System.out.println("Login:");
                            String logina = ler.nextLine();
                            System.out.println("Senha:");
                            String senhaa = ler.nextLine();
                            negocio.excluirJogador(nomea,logina,senhaa);
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Tudo salvo");
                    negocio.salvar();
                    break;
                default:
                    System.out.println("Opção não cadastrada.\n");
                    break;
            }
        }
    }
}
