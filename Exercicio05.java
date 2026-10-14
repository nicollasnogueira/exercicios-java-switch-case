// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = entrada.nextDouble();
        System.out.print("Escolha M (media), S (diferenca), P (produto) ou D (divisao): ");
        char opcao = entrada.next().toUpperCase().charAt(0);
        switch (opcao) {
            case 'M': System.out.println("Media: " + ((n1 + n2) / 2)); break;
            case 'S': System.out.println("Diferenca: " + Math.abs(n1 - n2)); break;
            case 'P': System.out.println("Produto: " + (n1 * n2)); break;
            case 'D':
                if (n2 != 0) {
                    System.out.println("Divisao: " + (n1 / n2));
                } else {
                    System.out.println("Nao e possivel dividir por zero.");
                }
                break;
            default: System.out.println("Opcao invalida.");
        }
        entrada.close();
    }
}
