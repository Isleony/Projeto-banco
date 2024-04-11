import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Heloisa Park";
        String tipoConta = "poupança";
        double saldo = 90000;

        System.out.println("**********");
        System.out.println("\nO Nome do cliente é: " + nome);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("\n**********");
        int opcao = 0;

        String menu = """
                ***Digite sua opção
                1 - Consultar saldo
                2 - Pix
                3 - Receber valor
                4 - Sair
                       """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é:" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor do pix para transferência?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não é possível tal transferência, sem saldo");
                } else if (valor == saldo) {
                    System.out.println("Tem certeza? Todo seu dinheiro");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double novoValor = leitura.nextDouble(); // Variable name should start with lowercase
                saldo += novoValor;

                System.out.println("Seu novo saldo é: " + novoValor);
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
