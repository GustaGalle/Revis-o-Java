import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex_27 {
    public static void main(String[] args) {
        ArrayList<String> participantes = new ArrayList<>();

        // Adicionando participantes, alguns repetidos
        participantes.add("Ana");
        participantes.add("Bruno");
        participantes.add("Carla");
        participantes.add("Ana");
        participantes.add("Diego");
        participantes.add("Bruno");
        participantes.add("Eduardo");
        participantes.add("Fernanda");
        participantes.add("Carla");
        participantes.add("Carla");
        participantes.add("Gabriel");

        System.out.println("Participantes originais: " + participantes);

        // Removendo nomes iguais
        Set<String> participantesUnicos = new HashSet<>(participantes);
        List<String> listaUnicos = new ArrayList<>(participantesUnicos);

        // Sorteando 3 ganhadores
        List<String> ganhadores = sortearGanhadores(listaUnicos, 3);

        System.out.println("Ganhadores do sorteio:");
        for (String ganhador : ganhadores) {
            System.out.println(ganhador);
        }
    }

    private static List<String> sortearGanhadores(List<String> participantes, int quantidade) {
        Random random = new Random();
        List<String> sorteados = new ArrayList<>();

        int max = Math.min(quantidade, participantes.size());

        while (sorteados.size() < max) {
            int index = random.nextInt(participantes.size());
            String sorteado = participantes.get(index);

            if (!sorteados.contains(sorteado)) {
                sorteados.add(sorteado);
            }
        }

        return sorteados;
    }
}
