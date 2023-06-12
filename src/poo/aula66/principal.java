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

        produto.qtdEmEstoque(produto);

        sc.close();
    }
}
