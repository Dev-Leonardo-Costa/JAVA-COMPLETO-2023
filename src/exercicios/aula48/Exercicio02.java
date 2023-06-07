package exercicios.aula48;

import java.util.Scanner;

public class Exercicio02 {

    /*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite X e Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro!");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo!");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro!");
            } else {
                System.out.println("Quarto!");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
