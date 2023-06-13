package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula97 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Leo");
        list.add("Elis");
        list.add("Leomar");
        list.add("Daniel");

        list.add(2, "Chico");

        System.out.println(list.size());
        for (String obj : list) {
            System.out.println(obj);
        }

        list.remove("Leo");
        System.out.println("\n-----------------remove-------------------");
        System.out.println(list.size());
        for (String obj : list) {
            System.out.println(obj);
        }

        list.removeIf(x -> x.charAt(0) == 'D');
        System.out.printf("\n---------------removeIf---------------------");
        System.out.println(list.size());
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n---------------Predicado---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("\n----------------Predicado2--------------------");
        String nome = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(nome);

    }
}
