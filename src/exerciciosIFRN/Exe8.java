package exerciciosIFRN;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o primeiro valor:");
        a = sc.nextInt();

        do { 
            System.out.println("Digite o segundo valor:");
            b = sc.nextInt();
            if (a == b) {
                System.out.println("O segundo valor deve ser diferente do primeiro!");
            }
        } while (a == b);

        do { 
            System.out.println("Digite o terceiro valor:");
            c = sc.nextInt();
            if (c == b || c == a) {
                System.out.println("Por favor, digite um número diferente dos primeiros números!");
            }
        } while (c == b || c == a);


        if (a > b && a > c) {
            if (b > c) {
                System.out.println("A ordem decrescente dos valores é: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("A ordem decrescente dos valores é: " + a + ", " + c + ", " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("A ordem decrescente dos valores é: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("A ordem decrescente dos valores é: " + b + ", " + c + ", " + a);
            }
        } else if (c > a && c > b) {
            if (b > a) {
                System.out.println("A ordem decrescente dos valores é: " + c + ", " + b + ", " + a);
            } else {
                System.out.println("A ordem decrescente dos valores é: " + c + ", " + a + ", " + b);
            }
        } 
        sc.close();
    }
}
