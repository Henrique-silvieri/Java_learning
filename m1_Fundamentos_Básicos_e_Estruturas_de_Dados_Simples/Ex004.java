// Exercício 4: Desenvolva um programa que leia dois números inteiros fornecidos pelo usuário e exiba o resultado das quatro operações

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();

        int adicao = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        float divisao = (float) numero1 / numero2;

        System.out.printf("%n%d + %d = %d %n%d - %d = %d %n%d * %d = %d %n%d / %d = %.2f",
                numero1, numero2, adicao, numero1, numero2, subtracao, numero1, numero2, multiplicacao, numero1, numero2, divisao);

    }
}
