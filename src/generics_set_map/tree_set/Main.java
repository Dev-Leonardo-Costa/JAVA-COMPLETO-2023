package generics_set_map.tree_set;



import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("NotBook", 900.00));
        set.add(new Product("Mouse", 32.59));
        set.add(new Product("Teclado pro", 133.25));


        for(Product p : set){
            System.out.println(set.contains(p));
        }

    }

}
