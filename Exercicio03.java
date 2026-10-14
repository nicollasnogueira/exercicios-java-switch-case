import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o periodo (M, V ou N): ");
        char periodo = entrada.next().toUpperCase().charAt(0);
        switch (periodo) {
            case 'M': System.out.println("Bom dia"); break;
            case 'V': System.out.println("Boa tarde"); break;
            case 'N': System.out.println("Boa noite"); break;
            default: System.out.println("Periodo invalido.");
        }
        entrada.close();
    }
}
