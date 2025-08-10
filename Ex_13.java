import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex_13 {
    public static void main(String[] args) {
       
        ArrayList<Integer> numerosComDuplicatas = new ArrayList<>();
        numerosComDuplicatas.add(5);
        numerosComDuplicatas.add(5);
        numerosComDuplicatas.add(10);
        numerosComDuplicatas.add(10);
        numerosComDuplicatas.add(20);
        numerosComDuplicatas.add(30);

        System.out.println("Lista original: " + numerosComDuplicatas);

        
        Set<Integer> setSemDuplicatas = new HashSet<>(numerosComDuplicatas);

    
        System.out.println("Lista sem duplicatas: " + setSemDuplicatas);
    }
}
