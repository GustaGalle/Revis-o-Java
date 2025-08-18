import java.lang.reflect.Field;

class Configuracao {
    private String urlConexao = "localhost:5432";
}

public class Ex_32{ 
    public static void main(String[] args) {
        try {
          
            Configuracao config = new Configuracao();

            Field campo = Configuracao.class.getDeclaredField("urlConexao");

            campo.setAccessible(true);

            campo.set(config, "db.producao.com:5432");

            String novoValor = (String) campo.get(config);
            System.out.println("Novo valor de urlConexao: " + novoValor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
