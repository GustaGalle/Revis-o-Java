import java.util.HashSet;
import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um e-mail para adicionar: ");
            String email = sc.nextLine().trim();

            if (emails.contains(email)) {
                System.out.println("Esse e-mail já está cadastrado!");
            } else {
                emails.add(email);
                System.out.println("E-mail adicionado com sucesso!");
            }

            System.out.print("Quer adicionar outro e-mail? (s/n): ");
            resposta = sc.nextLine().trim().toLowerCase();
        } while (resposta.equals("s"));

        System.out.println("\nLista final de e-mails cadastrados:");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println("Total de e-mails cadastrados (sem duplicatas): " + emails.size());
        sc.close();
    }
}
