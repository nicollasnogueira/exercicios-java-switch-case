import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o plano (A, B ou C): ");
        char plano = entrada.next().toUpperCase().charAt(0);
        System.out.print("Digite o salario atual: ");
        double salario = entrada.nextDouble();
        switch (plano) {
            case 'A': salario = salario * 1.10; break;
            case 'B': salario = salario * 1.15; break;
            case 'C': salario = salario * 1.20; break;
            default:
                System.out.println("Plano invalido.");
                entrada.close();
                return;
        }
        System.out.printf("Novo salario: R$ %.2f%n", salario);
        entrada.close();
    }
}
