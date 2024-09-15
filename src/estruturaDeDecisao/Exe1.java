package estruturaDeDecisao;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }
        sc.close();
    }
}
