package exercicios.aula28;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
        */

        Locale.setDefault(Locale.US);
        Scanner digitado = new Scanner(System.in);
        double raio, area;

        System.out.println("Digite o valor do raio: ");
        raio = digitado.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A area do circulo é: %.4f", area);

        digitado.close();





    }
}
