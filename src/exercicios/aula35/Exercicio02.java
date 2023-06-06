package exercicios.aula35;

import java.util.Scanner;

public class Exercicio02 {

    /*
    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }
}
