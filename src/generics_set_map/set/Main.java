package generics_set_map.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // o Set ele deixa os dados desordenado
        Set<String> set = new HashSet<>();

        set.add("Meia agua");
        set.add("Jig Pena");
        set.add("Popper");

        for (String listSet : set){
            System.out.println(listSet);
        }

        System.out.println();
        System.out.println("TreeSet");
        // O TreSet deixa ordena os dados
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Meia agua");
        treeSet.add("Jig Pena");
        treeSet.add("Popper");

        for (String listSet : set){
            System.out.println(listSet);
        }

        System.out.println();
        System.out.println("LinkedHashSet");
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Meia agua");
        linkedHashSet.add("Jig Pena");
        linkedHashSet.add("Popper");

        for (String listSet : set){
            System.out.println(listSet);
        }
    }

}
