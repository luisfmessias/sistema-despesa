import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Despesa> despesas = new ArrayList<>();
        List<TipoDespesa> tipos = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();

        // Criando um usuário de teste (POC)
        usuarios.add(new Usuario("Admin", "admin", "1234"));

        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE CONTROLE DE DESPESAS ===");
            System.out.println("1. Entrar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto");
            System.out.println("4. Listar Despesas Pagas");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data de Vencimento: ");
                    String data = sc.nextLine();
                    System.out.print("Categoria: ");
                    String cat = sc.nextLine();
                    despesas.add(new Despesa(desc, valor, data, cat));
                    System.out.println("Despesa cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Despesas em Aberto ---");
                    for (Despesa d : despesas) {
                        if (!d.isPaga()) System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.println("\n--- Despesas Pagas ---");
                    for (Despesa d : despesas) {
                        if (d.isPaga()) System.out.println(d);
                    }
                    break;

                case 6:
                    System.out.println("\nUsuários Cadastrados:");
                    for (Usuario u : usuarios) {
                        System.out.println(u);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
