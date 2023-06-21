package generics_set_map.curingas_delimitados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Forma> listForma = new ArrayList<>();
        listForma.add(new Retangulo(3.0,2.0));
        listForma.add(new Circulo(2.0));

        List<Circulo> circuloList = new ArrayList<>();
        circuloList.add(new Circulo(2.0));
        circuloList.add(new Circulo(3.0));

        System.out.println("Total area: " + totalArea(circuloList));

        /* Exemplo 2 Covariancia é quando as operações get da OK e o put da ERRO
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(9);
        List<? extends Number> list = integerList;
        Number x = list.get(0);
        ->list.add(20);
         */

        /* Exemplo 2 Contravariancia é quando as operações put da Ok e o get da ERRO
        List<Object> objects = new ArrayList<>();
        objects.add("Mario");
        objects.add("Leo");

        List<? super Number> listNum = lisObjs;

        listNum.add(10);
        listNum.add(20);

       -> Number x = listNum.get(0);
         */



    }

    private static Double totalArea(List<? extends Forma> list) {
        double soma = 0.0;
        for (Forma f : list){
            soma += f.area();
        }

        return  soma;
    }
}
