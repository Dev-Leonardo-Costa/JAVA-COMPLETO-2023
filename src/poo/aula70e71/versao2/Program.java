package poo.aula70e71.versao2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /*
      precisamos instanciar a classe para ter acesso aos metodos
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculador calc = new Calculador();

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = calc.circuferencia(raio);
        double d = calc.volume(raio);

        System.out.printf("Circuferencia: %.2f%n ", c);
        System.out.printf("Volume: %.2f%n ", d);
        System.out.printf("Valor PI: %.2f%n ", calc.PI);

        sc.close();
    }
}
