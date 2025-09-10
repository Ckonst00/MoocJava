import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoList = new ArrayList<>();

    public TodoList() {}

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {

        for (String task : todoList) {
            int index = this.todoList.indexOf(task);
            System.out.println(index + 1 + ": " + task);
        }
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}
