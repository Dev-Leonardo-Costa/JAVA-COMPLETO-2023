package programacao_funcional_lambda.predicado;

import programacao_funcional_lambda.comparator.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<programacao_funcional_lambda.comparator.Product> list = new ArrayList<>();

        list.add(new programacao_funcional_lambda.comparator.Product("NotBook", 900.00));
        list.add(new programacao_funcional_lambda.comparator.Product("Mouse", 32.59));
        list.add(new Product("Teclado pro", 133.25));
    }
}
