package saida_de_dados;

import java.util.Locale;

public class Aula23 {
    public static void main(String[] args) {
        // Printa com quebra de linha
        System.out.println("Bom dia, amanhecer");

        // Printa na tela
        System.out.print("Bom dia");

        System.out.printf("\n-----------------------------------\n\n");
        Locale.setDefault(Locale.US);

        int    y = 32;
        double x = 10.78945;
        System.out.printf("Valor de Y: " + y + "\n");
        System.out.printf("Valor de X:  %.2f%n", x);


        System.out.println("\n-----------------------------------\n");

        String nome = "Leonardo Costa";
        int idade = 30;
        double renda = 8000.0;

        System.out.printf("%s tem %d anos e ganha R$%.2f Reais %n", nome, idade, renda);

    }
}
