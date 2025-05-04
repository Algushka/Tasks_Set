import java.util.Objects;

public class Task {
private int number;
private String description;
private String status;
private int daysinProcessing;

    public Task(int number, String description, String status, int daysinProcessing) {
        this.number = number;
        this.description = description;
        this.status = status;
        this.daysinProcessing = daysinProcessing;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDaysinProcessing() {
        return daysinProcessing;
    }

    public void setDaysinProcessing(int daysinProcessing) {
        this.daysinProcessing = daysinProcessing;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Task:").append("number   :").append(number).append(" ;");
        stringBuilder.append("description   :").append(description).append (" ;");
        stringBuilder.append("status     :").append(status).append (" ;");
        stringBuilder.append("daysinProcessing    :").append(daysinProcessing).append (" \n");
        return stringBuilder.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return number == task.number && daysinProcessing == task.daysinProcessing && Objects.equals(description, task.description) && Objects.equals(status, task.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description, status, daysinProcessing);
    }
}




