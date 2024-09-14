import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;


        System.out.println("Digite um número:");
        numero = sc.nextInt();

        if (numero %2 != 0) {
            numero +=8;
            System.out.println("O número digitado + 8 = " + numero);
        } else {
            numero +=5;
            System.out.println("O número digitado + 5 = " + numero);
        }
    }
}
