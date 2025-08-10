import java.util.LinkedList;

public class Ex_11 {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carla");
        fila.add("Diego");
        fila.add("Eduardo");

        System.out.println("Fila inicial: " + fila);

        //removendo os 2 primeiros
        fila.removeFirst();
        fila.removeFirst();

        System.out.println("Após atender 2 clientes: " + fila);

        //adicionando 2 prioritarios
        fila.addFirst("Fátima (Prioritário)");
        fila.addFirst("Gustavo (Prioritário)");

        
        System.out.println("Fila final: " + fila);
    }
}
