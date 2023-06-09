package estrutura_repetitiva.forr;

import java.util.Scanner;

public class Aula49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o N:");
        int n = sc.nextInt();
        int soma = 0, x;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();
    }
}
