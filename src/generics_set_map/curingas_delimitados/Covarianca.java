package generics_set_map.curingas_delimitados;

import java.util.ArrayList;
import java.util.List;

public class Covarianca {
    public static void main(String[] args) {

        // Exemplo 2 Covariancia é quando as operações get da OK e o put da ERRO
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(9);
        List<? extends Number> list = integerList;
        Number x = list.get(0);
        list.add(20);

    }

}
