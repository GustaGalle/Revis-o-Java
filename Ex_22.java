import java.util.Map;
import java.util.TreeMap;

public class Ex_22 {
    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();

        // Adicionando alunos fora de ordem alfabética
        notas.put("Pedro", 7.5);
        notas.put("Ana", 9.0);
        notas.put("Carlos", 6.0);
        notas.put("Beatriz", 8.0);
        notas.put("João", 7.0);

        System.out.println("Notas dos alunos em ordem alfabética:");
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
