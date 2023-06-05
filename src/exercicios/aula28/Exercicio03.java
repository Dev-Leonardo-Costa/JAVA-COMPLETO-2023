package exercicios.aula28;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
          de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/

        Scanner digitado = new Scanner(System.in);
        int a,b,c,d, diferenca;

        System.out.println("Digite os valores de A a D: ");
        a = digitado.nextInt();
        b = digitado.nextInt();
        c = digitado.nextInt();
        d = digitado.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("DIFERENÇA = " + diferenca);

    }
}
