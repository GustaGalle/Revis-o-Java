import java.util.HashMap;
import java.util.Map;

public class Ex_19 {
    public static void main(String[] args) {
        String texto = "Quem não tem teto de vidro\r\n" + //
                        "Que atire a primeira pedra\r\n" + //
                        "Quem não tem teto de vidro\r\n" + //
                        "Que atire a primeira pedra\r\n" + //
                        "Andei, por tantas ruas e lugares\r\n" + //
                        "Passei, observando quase tudo\r\n" + //
                        "Mudei, o mundo gira num segundo\r\n" + //
                        "Busquei, dentro de mim os meus lares";
        //Bom gosto musical é importante para programar!!!!!
        //garantindo que tudo esteja minisculo 
        String[] palavras = texto.toLowerCase().replaceAll("[.,]", "").split("\\s+");

        HashMap<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        System.out.println("Frequência das palavras:");
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
