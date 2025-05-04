import java.util.List;
import java.util.Objects;

public class Programmer {
    private String name;
    private String city;
    private List<Task> tasks;

    public Programmer(String name, String city, List<Task> tasks) {
        this.name = name;
        this.city = city;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }




    //String builder
    public String toString(){
       StringBuilder stringBuilder=new StringBuilder("Programmer");
       stringBuilder.append("name : ").append(name);
       stringBuilder.append("city : ").append(city);
       stringBuilder.append ("tasks : ").append (tasks);
      return stringBuilder.toString();




    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, tasks);
    }
}
