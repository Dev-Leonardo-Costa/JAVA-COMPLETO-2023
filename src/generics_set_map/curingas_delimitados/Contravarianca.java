package generics_set_map.curingas_delimitados;

import java.util.ArrayList;
import java.util.List;

public class Contravarianca {
    public static void main(String[] args) {

        // Exemplo 2 Contravariancia é quando as operações put da Ok e o get da ERRO
        List<Object> objects = new ArrayList<>();
        objects.add("Mario");
        objects.add("Leo");

        List<? super Number> listNum = lisObjs;

        listNum.add(10);
        listNum.add(20);

        Number x = listNum.get(0);

    }
}
