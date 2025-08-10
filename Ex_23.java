import java.util.HashMap;
import java.util.Scanner;

public class Ex_23 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "11999999999");
        agenda.put("Bruno", "11888888888");
        agenda.put("Carla", "11777777777");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome para verificar se está na agenda: ");
        String nome = sc.nextLine().trim();

        if (agenda.containsKey(nome)) {
            System.out.println("O nome \"" + nome + "\" está na agenda.");
        } else {
            System.out.println("O nome \"" + nome + "\" não está na agenda.");
        }

        System.out.print("Digite um telefone para verificar se está na agenda: ");
        String telefone = sc.nextLine().trim();

        if (agenda.containsValue(telefone)) {
            System.out.println("O telefone \"" + telefone + "\" está na agenda.");
        } else {
            System.out.println("O telefone \"" + telefone + "\" não está na agenda.");
        }

        sc.close();
    }
}
