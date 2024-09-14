import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numeroDobro;
        int numeroTriplo;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero > 0) {
            numeroDobro = numero * 2;
            System.out.println("O dobro do número digitado é: " + numeroDobro);
        } else if (numero < 0) {
            numeroTriplo = numero * 3;
            System.out.println("O triplo do número digitado é: " + numeroTriplo);
        }
    }
}
