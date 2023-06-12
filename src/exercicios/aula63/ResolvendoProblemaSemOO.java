package exercicios.aula63;

import java.util.Locale;
import java.util.Scanner;

public class ResolvendoProblemaSemOO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite os lados do triangulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite os lados do triangulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double px = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(px * (px - xA) * (px - xB) * (px - xC));

        double py = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(px * (py - xA) * (py - xB) * (py - xC));

        System.out.printf("Triangulo X: %.4f%n%n", areaX);
        System.out.printf("Triangulo Y: %.4f%n%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triangulo X é maior");
        } else {
            System.out.println("Triangulo Y é maior");
        }

    }
}
