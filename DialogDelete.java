public class DialogDelete {
    private final AppInterface appInterface;
    private final Task task;
    private final Category category;

    public DialogDelete(AppInterface appInterface, Task task) {
        this.appInterface = appInterface;
        this.task = task;
        this.category = null;
    }

    public DialogDelete(AppInterface appInterface, Category category) {
        this.appInterface = appInterface;
        this.task = null;
        this.category = category;
    }

    public void confirmDeleteTask(boolean isConfirm) {
        if (task != null) {
            if (isConfirm) {
                appInterface.deleteTask(task);
            } else {
                System.out.println("Canceling Deletion Task");
            }
        } else {
            System.out.println("IllegalAction");
        }
    }

    public void confirmDeleteCategory(boolean isConfirm) {
        if (category != null) {
            if (isConfirm) {
                appInterface.deleteCategory(category);
            } else {
                System.out.println("Canceling Deletion Category");
            }
        } else {
            System.out.println("IllegalAction");
        }
    }
}
