package exercicios.aula90.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        double n = sc.nextDouble();

        double[] vet = new double[(int) n];

        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero:");
            vet[i] = sc.nextDouble();
        }

        double soma = 0, media;
        for (i = 0; i < vet.length; i++){
            soma = soma + vet[i];
        }

        media = soma / n;

        System.out.print("Valores = ");
        for (i = 0; i < vet.length; i++){
            System.out.printf("%.1f ", vet[i]);
        }

        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Media = %.2f ", media);

    }
}
