import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, sexo, estadoCivil;

        System.out.println("Por favor, digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Por favor, digite seu sexo:");
        sexo = sc.nextLine();
        System.out.println("Por favor, digite seu estado civil:");
        estadoCivil = sc.nextLine();

        if (sexo.equals("F") && estadoCivil.equals("CASADA")) {
            System.out.println(nome + " por favor, digite o tempo de casada: ");
        }
    }
}
