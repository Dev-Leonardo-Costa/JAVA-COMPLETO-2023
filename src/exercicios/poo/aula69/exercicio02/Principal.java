package exercicios.poo.aula69.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da Altura e largura do Retagulo");

        Retangulo retangulo = new Retangulo();
        System.out.print("Altura: ");
        retangulo.setAltura(sc.nextDouble());
        System.out.print("Largura: ");
        retangulo.setLargura(sc.nextDouble());

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Primetro = %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());

        sc.close();
    }
}
