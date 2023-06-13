package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula88 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n];
        double suma = 0.0;

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
            suma += vetor[i];
        }

        double vag = suma / n;

        System.out.printf("Valor exato: %.2f%n", vag);

        sc.close();
    }
}
