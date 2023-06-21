package generics_set_map.curingas_delimitados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProblemResult {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(3.14, 5.15);
        List<Objects> objects = new ArrayList<Objects>();

//        copy(integers, objects);
//        printList(objects);
//        copy(doubles, objects);
//        printList(objects);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print("Obj " + obj);
        }
        System.out.println();
    }


}
