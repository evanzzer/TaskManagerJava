import java.util.Date;

public class DialogEdit {
    private final AppInterface appInterface;
    private final Task oldTask;

    public DialogEdit(AppInterface appInterface, Task task) {
        this.appInterface = appInterface;
        this.oldTask = task;
    }

    public void updateTask(String description, Date deadline) {
        Task newTask = new Task(oldTask.getId(), description, deadline);
        appInterface.editTask(oldTask, newTask);
    }

    public void updateCategory(Category category, String newName) {
        appInterface.editCategory(category, newName);
    }
}

