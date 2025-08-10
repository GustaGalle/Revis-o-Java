import java.util.LinkedHashSet;

public class Ex_15 {
    public static void main(String[] args) {
        LinkedHashSet<String> diasDaSemana = new LinkedHashSet<>();
     
        diasDaSemana.add("Quarta");
        diasDaSemana.add("Segunda");
        diasDaSemana.add("Sexta");
        diasDaSemana.add("Terça");
        diasDaSemana.add("Domingo");
        diasDaSemana.add("Sábado");
        diasDaSemana.add("Quinta");

        System.out.println("Dias da semana na ordem de inserção:");
        for (String dia : diasDaSemana) {
            System.out.println(dia);
        }
    }
}
