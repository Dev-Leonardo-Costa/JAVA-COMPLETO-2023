package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aula89 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quatos produtos: ");
        int n = sc.nextInt();

        Produto[] produtos = new Produto[n];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }

        double avg = soma / produtos.length;

        System.out.printf("Preço final: %.2f", avg);

        sc.close();
    }

}
