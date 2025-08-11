import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite uma frase: ");
        String frase = sc.nextLine();
        
        String[] palavras = frase.split("\\s+");

        Deque<String> pilha = new ArrayDeque<>();

        for (String palavra : palavras) {
            pilha.push(palavra);
        }

        StringBuilder fraseInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            fraseInvertida.append(pilha.pop());
            if (!pilha.isEmpty()) {
                fraseInvertida.append(" ");
            }
        }

        System.out.println("Frase invertida: " + fraseInvertida);

        sc.close();
    }
}
