import java.util.LinkedHashMap;
import java.util.Map;

public class Ex_21 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();

        produtos.put(5, "Notebook");
        produtos.put(2, "Smartphone");
        produtos.put(1, "Monitor");
        produtos.put(3, "Teclado");
        produtos.put(4, "Mouse");

        System.out.println("Produtos na ordem de inserção:");
        for (Map.Entry<Integer, String> entry : produtos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " - Produto: " + entry.getValue());
        }
    }
}
