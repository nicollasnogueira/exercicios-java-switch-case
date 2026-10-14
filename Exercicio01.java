// Nome: Nicollas Nogueira Fernandes
// RA: 1252625635

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");
        int dia = entrada.nextInt();
        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira"); break;
            case 3: System.out.println("Terca-feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sabado"); break;
            default: System.out.println("Dia invalido.");
        }
        entrada.close();
    }
}
