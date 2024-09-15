import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numeroIdentificacao;
        double nota1, nota2, nota3;
        double mediaExercicios;
        double mediaAproveitamento;
        String conceito = "";
        String mensagem = "";

        // mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + media)

        System.out.println("Digite o número de identificação:");
        numeroIdentificacao = sc.nextLong();
        
        System.out.println("Digite a primeira nota (de 0 à 100):");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota (de 0 à 100):");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota (de 0 à 100):");
        nota3 = sc.nextDouble();

        System.out.println("Digite a média dos exercícios:");
        mediaExercicios = sc.nextDouble();

        mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
        
        if (mediaAproveitamento >= 90) {
            conceito = "A";
            mensagem = "Aprovado!";
        } else if (mediaAproveitamento >= 75 && mediaAproveitamento < 90) {
            conceito = "B";
            mensagem = "Aprovado!";
        } else if (mediaAproveitamento >= 60 && mediaAproveitamento < 75) {
            conceito = "C";
            mensagem = "Aprovado!";
        } else if (mediaAproveitamento >= 40 && mediaAproveitamento < 60) {
            conceito = "D";
            mensagem = "Reprovado!";
        } else if (mediaAproveitamento < 40) {
            conceito = "E";
            mensagem = "Reprovado!";
        }
        System.out.println(mediaAproveitamento);

        System.out.println("Aluno: " + numeroIdentificacao + ", Nota 1: " + nota1 + ", Nota 2: " + nota2 + ", Nota 3: " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios + ", Conceito: " + conceito + ", " + mensagem);

    }
}
