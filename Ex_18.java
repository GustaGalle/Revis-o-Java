import java.util.HashMap;
import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        HashMap<String, String> dicionario = new HashMap<>();

        dicionario.put("casa", "house");
        dicionario.put("carro", "car");
        dicionario.put("livro", "book");
        dicionario.put("gato", "cat");
        dicionario.put("cachorro", "dog");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra em português para traduzir: ");
        String palavra = sc.nextLine().toLowerCase();

        if (dicionario.containsKey(palavra)) {
            System.out.println("Tradução: " + dicionario.get(palavra));
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }

        sc.close();
    }
}
