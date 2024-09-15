import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeParcelas;
        String formaPagamento;
        double preco;

        System.out.println("Digite a quantidade de parcelas:");
        quantidadeParcelas = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a forma de pagamento:");
        formaPagamento = sc.nextLine();

        System.out.println("Digite o preço de etiqueta:");
        preco = sc.nextDouble();

        if (quantidadeParcelas == 1 && (formaPagamento.equalsIgnoreCase("dinheiro") || formaPagamento.equalsIgnoreCase("cheque"))) {
            System.out.println("O valor a pagar é de: " + (preco * 0.90));
        } else if (quantidadeParcelas == 1 && formaPagamento.equalsIgnoreCase("credito")) {
            System.out.println("O valor a pagar é de: " + (preco * 0.85));
        } else if (quantidadeParcelas == 2 && formaPagamento.equalsIgnoreCase("credito")) {
            System.out.println("O valor a pagar é de: " + (preco));
        } else if (quantidadeParcelas == 2 && formaPagamento.equalsIgnoreCase("debito")) {
            System.out.println("O valor a pagar é de: " + (preco + (preco * 0.10)));
        } else {
            System.out.println("aqui");
        }


    }
}
