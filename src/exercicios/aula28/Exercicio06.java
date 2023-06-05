package exercicios.aula28;

import javafx.print.Printer;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner digitado = new Scanner(System.in);
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

        a = digitado.nextDouble();
        b = digitado.nextDouble();
        c = digitado.nextDouble();

        System.out.println("Digite os valores:");
        triangulo = (a * c) / 2;
        circulo   = Math.PI * Math.pow(c, 2);
        trapezio  = (a + b) * c / 2;
        quadrado  = (b * b);
        retangulo = (a * b);

        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n",   circulo);
        System.out.printf("Trapezio: %.3f%n",  trapezio);
        System.out.printf("Quadadro: %.3f%n",  quadrado);
        System.out.printf("Retagunlo: %.3f%n", retangulo);

    }
}
