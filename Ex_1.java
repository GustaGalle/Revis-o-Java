import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        float nota1 = notas.nextFloat();
        System.out.print("Digite a nota 2: ");
        float nota2 = notas.nextFloat();
        System.out.print("Digite a nota 3: ");
        float nota3 = notas.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Media obtida: %.2f! ", media);
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } 
        else {
            if (media >= 5 && media < 7 ) {
            System.out.println("Recuperacao");
        } else{
            System.out.println("Reprovado");
        }
        }
    }
};