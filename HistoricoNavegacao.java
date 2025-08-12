//Ex_29
import java.util.LinkedList;

public class HistoricoNavegacao {
    private LinkedList<String> historico;
    private int currentIndex;

    public HistoricoNavegacao() {
        historico = new LinkedList<>();
        currentIndex = -1; 
    }

    public void visitar(String url) {
        
        while (historico.size() > currentIndex + 1) {
            historico.removeLast();
        }
        historico.add(url);
        currentIndex++;
        System.out.println("Visitando: " + url);
    }

    public void voltar() {
        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("Voltando para: " + historico.get(currentIndex));
        } else {
            System.out.println("Não há páginas anteriores.");
        }
    }

    public void avancar() {
        if (currentIndex < historico.size() - 1) {
            currentIndex++;
            System.out.println("Avançando para: " + historico.get(currentIndex));
        } else {
            System.out.println("Não há páginas seguintes.");
        }
    }

    public void exibirHistorico() {
        System.out.println("Histórico: " + historico);
        System.out.println("Página atual: " + (currentIndex >= 0 ? historico.get(currentIndex) : "Nenhuma"));
    }

    public static void main(String[] args) {
        HistoricoNavegacao navegador = new HistoricoNavegacao();

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");

        navegador.voltar();
        navegador.voltar();
        navegador.avancar();

        navegador.visitar("stackoverflow.com");

        navegador.exibirHistorico();
    }
}
