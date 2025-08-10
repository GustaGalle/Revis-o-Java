import java.util.TreeSet;

public class Ex_16 {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<>();

        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Beatriz");
        nomes.add("João");

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
