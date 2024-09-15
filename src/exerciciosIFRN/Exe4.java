package exerciciosIFRN;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Digite o primeiro número:");
        a = sc.nextInt();
        System.out.println("Digite o segundo número:");
        b = sc.nextInt();

        if (a == b) {
            c = a + b;
            System.out.println("O resultado da soma dos dois números é: " + c);
        } else {
            c = a * b;
            System.out.println("O resultado da multiplicação dos dois números é: " + c);
        }
        sc.close();
    }
}
