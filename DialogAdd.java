import java.util.Date;

public class DialogAdd {
    private final AppInterface appInterface;

    public DialogAdd(AppInterface appInterface) {
        this.appInterface = appInterface;
    }

    public void insertTask(String categoryId, String description, Date deadline) {
        Task newTask = new Task(description, deadline);
        appInterface.addTask(categoryId, newTask);
    }

    public void insertCategory(String name) {
        Category category = new Category(name);
        appInterface.addCategory(category);
    }
}
