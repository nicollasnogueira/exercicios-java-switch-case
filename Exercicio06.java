// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o codigo do produto (100 a 105): ");
        int codigo = entrada.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();
        String produto;
        double preco;
        switch (codigo) {
            case 100: produto = "Cachorro quente"; preco = 1.20; break;
            case 101: produto = "Bauru simples"; preco = 1.30; break;
            case 102: produto = "Bauru com ovo"; preco = 1.50; break;
            case 103: produto = "Hamburguer"; preco = 1.20; break;
            case 104: produto = "Cheeseburguer"; preco = 1.30; break;
            case 105: produto = "Refrigerante"; preco = 1.00; break;
            default:
                System.out.println("Codigo invalido.");
                entrada.close();
                return;
        }
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");
        } else {
            System.out.println("Produto: " + produto);
            System.out.printf("Valor a pagar: R$ %.2f%n", preco * quantidade);
        }
        entrada.close();
    }
}
