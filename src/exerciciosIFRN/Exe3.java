package exerciciosIFRN;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número:");
        numero = sc.nextInt();

        if (numero %2 != 0){
            System.out.println("O número digitado é ímpar");
        } else {
            System.out.println("O número digitado é par");
        }
        sc.close();
    }
}
