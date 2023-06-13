package exercicios.aula90.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print("Digite um numero:");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }

    }
}
