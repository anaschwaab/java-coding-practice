
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a + b) < c) {
            System.out.println("A soma de " + a + " + " + b + " é menor que " + c);
        }

        sc.close();
    }
}
