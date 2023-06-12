package poo.aula70e71.versao3;

import poo.aula70e71.versao2.Calculador;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
      precisamos instanciar a classe para ter acesso aos metodos
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = CalculadorVersao3.circuferencia(raio);
        double d = CalculadorVersao3.volume(raio);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", d);
        System.out.printf("Valor PI: %.2f%n", CalculadorVersao3.PI);

        sc.close();
    }
}
