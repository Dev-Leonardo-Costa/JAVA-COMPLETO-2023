package exercicios.aula35;

import java.util.Scanner;

public class Exercicio01 {

    /*
    Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro Negativo ou Positivo:");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Não Negativo!");
        } else {
            System.out.println("Negativo!");
        }
    }
}
