package exercicios.aula28;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
      código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner digitado = new Scanner(System.in);

        int codigo1, numero1, codigo2, numero2;
        double valorUnitario1, valorUnitario2, valorTotal;

        System.out.println("Digite os valores: ");
        codigo1 = digitado.nextInt();
        numero1 = digitado.nextInt();
        valorUnitario1 = digitado.nextDouble();

        codigo2 = digitado.nextInt();
        numero2 = digitado.nextInt();
        valorUnitario2 = digitado.nextDouble();

        valorTotal = (valorUnitario1 * numero1) + (valorUnitario2 * numero2);

        System.out.printf("Valor a pagar R$%.2f%n",valorTotal);

        digitado.close();
    }
}
