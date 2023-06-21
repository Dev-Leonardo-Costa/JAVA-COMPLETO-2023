package generics_set_map.generic_delimitado;

import java.util.List;

public class CalculationService<T> {

    public static <T extends Comparable<? super T>> T max(List<T> list){
      if (list.isEmpty()){
          throw new IllegalStateException("Lista vazia!");
      }

      T max = list.get(0);

      for (T item : list){
          if (item.compareTo(max) > 0){
              max = item;
          }
      }

      return max;
    }
}
