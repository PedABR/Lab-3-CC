package lp2;

import java.util.Scanner;

public class Exibir {

    private String msg;
    private Scanner sc = new Scanner(System.in);
    private int posicao;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String opcao;


    public void exibirContatos() {
        System.out.print("Contato> ");
        posicao = sc.nextInt();

        Contato.getContato(posicao);

    }

    public void cadastrarContato() {

        System.out.print("\n" +
                "Posição: ");
        posicao = sc.nextInt();

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.print("Telefone: ");
        telefone = sc.nextLine();

        Contato contato = new Contato(posicao, nome, sobrenome, telefone);

    }

    public void exibirMenu() {
        msg = "(C)adastrar Contato" +
                "\n" +
                "(L)istar Contato" +
                "\n" +
                "(E)xibir Contato" +
                "\n" +
                "(S)air" +
                "\n \n" +
                "Opção> ";

        while (true) {
            while (true) {
                System.out.print(msg);
                opcao = sc.nextLine();

                if (opcao.equals("C") || opcao.equals("L") || opcao.equals("E") || opcao.equals("S")) {
                    break;
                } else {
                    System.out.println("OPÇÃO INVÁLIDA!");
                    continue;
                }
            }

            if (opcao.equals("C")) {
                cadastrarContato();
            }

            else if (opcao.equals("L")) {
                listarContatos();
            }

            else if (opcao.equals("E")) {
                exibirContatos();
            }

            else if (opcao.equals("S")) {
                break;
            }
        }
    }
}