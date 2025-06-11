// Exercício 3: Crie um programa que leia o nome de uma pessoa e exiba uma saudação personalizada utilizando esse nome.

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("É um prazer te conhecer, %s!", nome);
    }
}
