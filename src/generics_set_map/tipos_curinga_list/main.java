package generics_set_map.tipos_curinga_list;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,2,8);

        List<String> listNomes = Arrays.asList("Maria", "Caio", "Leo");


        printList(list);
        printList(listNomes);

    }

    // nao podemos fazer add nas list curingas
    public static void printList(List<?> listCuringa){
        for (Object obj : listCuringa){
            System.out.println(obj);
        }
    }
}
