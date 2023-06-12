package exercicios.poo.aula72.exercicio01;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar? ");
        double precoUsd = sc.nextDouble();

        System.out.print("Quantos dolares você quer ? ");
        double qtdUsd = sc.nextDouble();

        System.out.printf("Valor a ser pago em reais %.2f", ConversaoDeMoedas.calculador(precoUsd, qtdUsd));

    }
}
