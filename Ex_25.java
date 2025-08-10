import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex_25 {
    public static void main(String[] args) {
        Deque<String> pilhaLivros = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Empilhando 3 livros:");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do livro " + i + ": ");
            String livro = sc.nextLine();
            pilhaLivros.push(livro);
            System.out.println("Livro \"" + livro + "\" empilhado.");
        }

        System.out.println("\nDesempilhando um livro...");
        String livroRemovido = pilhaLivros.pop();
        System.out.println("Livro removido da pilha: " + livroRemovido);

        String livroTopo = pilhaLivros.peek();
        System.out.println("Livro no topo da pilha (sem remover): " + livroTopo);

        sc.close();
    }
}
