import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// 1. Criando a anotação personalizada
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Teste {
}


class MinhaClasseDeTeste {

    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este não é um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}

// 3. Executor de testes
public class Ex_33{ 

    public static void executarTestes(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] metodos = clazz.getDeclaredMethods();

        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    System.out.println("Executando: " + metodo.getName());
                    metodo.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Erro ao executar " + metodo.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        MinhaClasseDeTeste testes = new MinhaClasseDeTeste();
        executarTestes(testes);
    }
}
