import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Agenda de Contatos =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar telefone pelo nome");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = sc.nextLine().trim();
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine().trim();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado/atualizado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do contato para buscar: ");
                    String busca = sc.nextLine().trim();
                    if (agenda.containsKey(busca)) {
                        System.out.println("Telefone de " + busca + ": " + agenda.get(busca));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    if (agenda.isEmpty()) {
                        System.out.println("A agenda está vazia.");
                    } else {
                        System.out.println("Lista de contatos:");
                        for (Map.Entry<String, String> entry : agenda.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
