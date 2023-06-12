package poo.aula66;

import java.util.Locale;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Enter produto data");
        System.out.print("Nome: ");
        produto.setNome(sc.nextLine());
        System.out.print("Preço: ");
        produto.setPreco(sc.nextDouble());
        System.out.print("Quantidade: ");
        produto.setQuantidade(sc.nextInt());

        System.out.println(produto);

        System.out.print("Entre com um numero de produtos para ser adicionado ao estoque: ");
        int add = sc.nextInt();
        produto.addProduto(add);
        System.out.println("Update "+ produto);

        System.out.printf("Quantos produtos deseja remover:  ");
        int remove = sc.nextInt();
        produto.removeProtudos(remove);
        System.out.println("Update " + produto);

        sc.close();
    }
}
