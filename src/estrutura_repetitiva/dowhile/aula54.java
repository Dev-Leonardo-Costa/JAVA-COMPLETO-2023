package estrutura_repetitiva.dowhile;

import java.util.Locale;
import java.util.Scanner;

public class aula54 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char r;
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n ", f);
            System.out.println("Deseja repetir ? N para Não / S para Sim: ");
            r = sc.next().charAt(0);
        } while (r != 'n');

        sc.close();
    }
}
