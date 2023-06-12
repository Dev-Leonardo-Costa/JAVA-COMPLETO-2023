package exercicios.aula63.aula64;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do Triangulo X ");
        Triangulo x = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.print("Digite o valor do Triangulo Y ");
        Triangulo y = new Triangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        if (areaX > areaY) {
            System.out.println("Triangulo X é Maior!");
        } else if (areaX == areaY) {
            System.out.println("Triangulo Y é Maior!");
        } else {
            System.out.println("Triangulos Iguais");
        }

    }
}
