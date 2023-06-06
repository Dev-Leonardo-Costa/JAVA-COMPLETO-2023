package exercicios.aula35;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    /*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    seguir, calcule e mostre o valor da conta a pagar
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Codigo do item e quantidade!");
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        double preco, soma;

        if (cod == 1) {
            preco = 4.00;
            System.out.println("1 Cachorro Quente R$4.00");
            soma = preco * qtd;
            System.out.printf("Total: R$ %.2f%n", soma);
        } else if (cod == 2) {
            preco = 4.50;
            System.out.println("2 X-salada R$4.50");
            soma = preco * qtd;
            System.out.printf("Total: R$ %.2f%n", soma);
        } else if (cod == 3) {
            preco = 5.00;
            System.out.println("3 X-Banco R$5.00");
            soma = preco * qtd;
            System.out.printf("Total: R$ %.2f%n", soma);
        } else if (cod == 4) {
            preco = 2.00;
            System.out.println("4 Torrada simples R$2.00");
            soma = preco * qtd;
            System.out.printf("Total: R$ %.2f%n", soma);
        } else {
            preco = 1.50;
            System.out.println("5 Refrigerante R$1.50");
            soma = preco * qtd;
            System.out.printf("Total: R$ %.2f%n", soma);
        }


    }
}
