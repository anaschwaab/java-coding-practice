import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean a, b;

        System.out.println("Digite dois valores booleano (true ou false): ");
        a = sc.nextBoolean();
        b = sc.nextBoolean();

        if (a && b) {
            System.out.println("Os dois valores são verdadeiros");
        } else if (a && !b) {
            System.out.println("O primeiro valor é verdadeiro e o segundo valor é falso");
        } else if (!a && b) {
            System.out.println("O primeiro valor é falso e o segundo valor é verdadeiro");
        } else {
            System.out.println("Os dois valores são falsos");
        }
    }
}
