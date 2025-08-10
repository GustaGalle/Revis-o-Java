import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {   
    int[] numeros = {1,2,3,4,5};  
    int soma = 0;
    for (int i : numeros) {
        if(i%2 != 0){
            soma = soma + i;
        }
    }  
     
    System.out.printf("A soma: %d",soma);    
    }
}