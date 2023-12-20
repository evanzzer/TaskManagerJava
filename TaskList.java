import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final ArrayList<Task> taskList = new ArrayList<>();

    public void insertToList(Task task) {
        taskList.add(task);
    }

    public Task getSpecificTask(String id) {
        List<Task> filtered = taskList.stream().filter(task -> task.getId().equals(id)).toList();
        if (!filtered.isEmpty()) {
            return filtered.get(0);
        } else{
            return null;
        }
    }

    public ArrayList<Task> getAllContent() {
        return taskList;
    }

    public void editTaskInList(Task oldTask, Task newTask) {
        taskList.set(taskList.indexOf(oldTask), newTask);
    }

    public void removeFromList(Task task) {
        taskList.remove(task);
    }
}
