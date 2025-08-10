import java.util.ArrayList;
import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Lista de Tarefas =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = sc.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o índice da tarefa para remover: ");
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        String removida = tarefas.remove(indice);
                        System.out.println("Tarefa removida: " + removida);
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Lista de Tarefas ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + " - " + tarefas.get(i));
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
