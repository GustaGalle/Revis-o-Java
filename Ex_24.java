import java.util.LinkedList;
import java.util.Queue;

public class Ex_24 {
    public static void main(String[] args) {
        Queue<String> filaImpressao = new LinkedList<>();

        
        filaImpressao.add("Documento1.pdf");
        filaImpressao.add("Foto.png");
        filaImpressao.add("Relatorio.docx");
        filaImpressao.add("Planilha.xlsx");
        filaImpressao.add("Apresentacao.pptx");

        System.out.println("Fila de impressão inicial: " + filaImpressao);

        while (!filaImpressao.isEmpty()) {
            String doc = filaImpressao.poll(); 
            System.out.println("Imprimindo: " + doc);
        }

        System.out.println("Fila de impressão vazia.");
    }
}
