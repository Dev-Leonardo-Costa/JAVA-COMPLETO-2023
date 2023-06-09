package exercicios.aula53;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisão impossivel");
            } else {
                double dividir = (double) x / y;
                System.out.printf("%.1f%n", dividir);
            }
        }

        sc.close();
    }

}
