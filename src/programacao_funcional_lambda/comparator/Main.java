package programacao_funcional_lambda.comparator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("NotBook", 900.00));
        list.add(new Product("Mouse", 32.59));
        list.add(new Product("Teclado pro", 133.25));



        /*
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }

        };
         list.sort((comp));
         */

        /* Comparator com classe anonima
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        list.sort((comp));
         */

        /* Comparator com classe anonima
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        list.sort((comp));
         */

        list.sort(((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())));

        for (Product p : list) {
            System.out.println(p);
        }

    }

}
