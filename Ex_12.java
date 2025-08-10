import java.util.ArrayList;
import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Guarulhos");
        cidades.add("Vitória");
        cidades.add("Fortaleza");
        cidades.add("Salvador");
        cidades.add("Brasília");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da cidade que deseja buscar: ");
        String busca = sc.nextLine();

        if (cidades.contains(busca)) {
            int indice = cidades.indexOf(busca);
            System.out.println("A cidade \"" + busca + "\" está na lista, no índice: " + indice);
        } else {
            System.out.println("A cidade \"" + busca + "\" não foi encontrada na lista.");
        }

        sc.close();
    }
}
