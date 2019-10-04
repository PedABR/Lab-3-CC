package lp2;

import java.util.Scanner;

public class Menu {

    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        String msg = "(C)adastrar Contato" +
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

                System.out.print("\n" +
                        "Posição: ");
                int posicao = sc.nextInt();
                sc.nextLine();
                if (posicao < 1 || posicao >100){
                    System.out.println("POSIÇÃO INVÁLIDA!\n");
                    continue;
                }

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Sobrenome: ");
                String sobrenome = sc.nextLine();

                System.out.print("Telefone: ");
                String telefone = sc.nextLine();

                agenda.cadastraContato(posicao, nome, sobrenome, telefone);

                System.out.println("CADASTRO REALIZADO!\n");

            } else if (opcao.equals("L")) {
                System.out.println(agenda.listaContatos());

            } else if (opcao.equals("E")) {

                System.out.print("Contato> ");
                int posicao = sc.nextInt();
                sc.nextLine();
                if (posicao < 1 || posicao >100) {
                    System.out.println("POSIÇÃO INVÁLIDA!");
                    continue;
                }
                System.out.println(agenda.exibeContato(posicao));

            } else if (opcao.equals("S")) {
                break;
            }
        }
    }
}
