package exerciciosIFRN;

import java.util.Scanner;

public class Exe9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        String sexo;
        double pesoIdeal;

        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite seu sexo:");
        sexo = sc.nextLine();

        if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é de: %.2f\n", pesoIdeal);
        } else {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é de: %.2f\n", pesoIdeal);
        }
        sc.close();
    }
}
