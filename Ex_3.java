import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.print("Adivinhe o numero de 0 a 100\n");
        
        Random gerador = new Random();
        int numAle = gerador.nextInt(101);
        boolean chute = false;
        
        while (chute == false){
            System.out.print("Chute: ");
            int num = numero.nextInt();
            if (num != numAle) {
                chute = false;
                System.out.print("tente de novo\n");
            }else {
                chute = true;
                System.out.print("acertou!!");
            }
        }
        
    }
};