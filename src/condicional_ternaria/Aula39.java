package condicional_ternaria;

import java.util.Locale;
import java.util.Scanner;

public class Aula39 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto ternario: " + desconto);

        System.out.println("Digite o valor");
        double prec = sc.nextDouble();

        if (prec < 20.0) {
            prec *= 0.1;
        } else {
            prec *= 0.05;
        }

        System.out.println("Desconto condicional: " + prec);

    }
}
