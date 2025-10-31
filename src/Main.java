import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== SISTEMA DE CONTROLE DE DESPESAS ====");
            System.out.println("1 - Entrar Despesa");
            System.out.println("2 - Anotar Pagamento");
            System.out.println("3 - Listar Despesas em Aberto");
            System.out.println("4 - Listar Despesas Pagas");
            System.out.println("5 - Gerenciar Tipos de Despesa");
            System.out.println("6 - Gerenciar Usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar 
            switch (opcao) {
                case 1:
                    System.out.println(">>> Entrar Despesa selecionado.\n");
                    break;
                case 2:
                    System.out.println(">>> Anotar Pagamento selecionado.\n");
                    break;
                case 3:
                    System.out.println(">>> Listar Despesas em Aberto.\n");
                    break;
                case 4:
                    System.out.println(">>> Listar Despesas Pagas.\n");
                    break;
                case 5:
                    System.out.println(">>> Gerenciar Tipos de Despesa.\n");
                    break;
                case 6:
                    System.out.println(">>> Gerenciar Usuários.\n");
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
