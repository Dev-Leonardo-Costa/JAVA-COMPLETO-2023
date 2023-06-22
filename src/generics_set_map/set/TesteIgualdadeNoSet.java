package generics_set_map.set;

import generics_set_map.tree_set.Product;

import java.util.HashSet;
import java.util.Set;

public class TesteIgualdadeNoSet {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("NotBook", 900.00));
        set.add(new Product("Mouse", 32.59));
        set.add(new Product("Teclado pro", 133.25));

        Product product = new Product("NotBook", 900.00);

        System.out.println(set.contains(product));

    }

}
