


//Дан список Programmer(String name, String city, List<Task>  tasks).
// Каждый программист  имеет список задач
// Task (int Number, String description, String status, int daysInProcessing)
// . Причем, одна задача может быть в списке у нескольких программистов
// Сформировать лист из всех задач.



//Дано два списка с Person необходимо получить Set с персонами
// которые присутствуют и в том и в другом списке



//Дан список Person. Необходимо написать метод, который вернет
// Set из пользователей, которые в данном списке встречаются более одного раза

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List <Task> tasks1 = new ArrayList<>(List.of(new Task(5,"first task","done", 8),new Task(7,"third task","undone", 9),new Task(5,"second task","done", 20)));
        List <Task> tasks2 = new ArrayList<>(List.of(new Task(5,"second task","done", 20),new Task(8,"second task","done", 22)));
List <Programmer> programmerList = new ArrayList<>(List.of(new Programmer("Jenya", "Ulyanivsk", tasks1), new Programmer("Max", "Moscow", tasks2)));/*, new Programmer ("Max", "Moscow", tasks2));*/
List<Task> sortedList= new ArrayList<>();
   //     for (int i=0; i<programmerList.size();i++) {
  //  sortedList.addAll(removeDoubleTask(programmerList.get(i).getTasks()));
   //         System.out.println(sortedList);
        List<Task> listTask = new ArrayList<>();
        for (int i=0; i<programmerList.size();i++){
              listTask.addAll(programmerList.get(i).getTasks());}
        System.out.println(removeDoubleTask(listTask));
}





    public static <T> ArrayList<T> removeDoubleTask(List<T>task) {
        List <T> lisk = new ArrayList<>();
        Set<T> taskSet = new HashSet<>();
        for ( T onetask:task) {
            taskSet.add(onetask);

        }
        return new ArrayList<>(taskSet);
    }





    public static <T> ArrayList<T> removeDouble(List<T>...tasks) {
      List <T> lisk = new ArrayList<>();
        Set<T> taskSet = new HashSet<>();
        for ( List<T> onetask:tasks) {
              taskSet.addAll(onetask);

        }
return new ArrayList<>(taskSet);
    }

}