//Дано два списка с Person необходимо получить Set с персонами
// которые присутствуют и в том и в другом списке

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
List<Person> listPerson1 = new ArrayList<>(List.of(new Person("Petya",18),
        new Person("Masha", 20), new Person ("Igor", 25)));
List<Person> listPerson2 = new ArrayList<>(List.of(new Person("Petya",18),
                new Person("Masha", 20), new Person ("Max", 2)));
        System.out.println(new ArrayList<>(collectDublicate(listPerson1, listPerson2)));





    }
    public static <T> Set<T> collectDublicate(List<T> list1, List<T> list2) {
       Set <T> setPerson = new HashSet<>(list1);
       Set <T> setDouble = new HashSet<>();
      for (T element:list2) {
          if (!setPerson.add(element)) setDouble.add(element);

      }
        return setDouble;
    }



}
