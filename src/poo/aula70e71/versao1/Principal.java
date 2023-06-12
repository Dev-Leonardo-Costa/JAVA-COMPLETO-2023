package poo.aula70e71.versao1;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    /*
      Primeira versão de se trabalhar com os membros STATCS
     */
    public static final double PI = Math.PI;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = circuferencia(raio);
        double d = volume(raio);

        System.out.printf("Circuferencia: %.2f ", c);
        System.out.printf("Volume: %.2f ", d);
        System.out.printf("Valor PI: %.2f ", PI);

        sc.close();
    }

    public static double circuferencia(double raio){
        return 2.0 * PI * raio;
    }
    public static double volume(double raio){
        return  4.0 * PI * raio * raio * raio / 3.0;
    }

}
