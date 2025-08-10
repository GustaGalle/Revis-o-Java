import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int num = numero.nextInt();
        
        System.out.printf("Tabuada do %d:\n", num);

        
        int contador = 1;
        for (int i = 0; i < 11; i++) {
            int mut = num * contador;
            System.out.printf("%d x %d = %d\n", num,i,mut);
    }
        
    }
};