package exercicios.poo.aula220;

import exercicios.poo.aula220.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Quantos produtos deseja inserir na lista ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            System.out.print("Qdt: ");
            int qdt = sc.nextInt();
            Produto produto = new Produto(nome, preco, qdt);
            produtos.add(produto);
        }

        for (Produto list : produtos) {
            System.out.println(list);
        }

    }
}
