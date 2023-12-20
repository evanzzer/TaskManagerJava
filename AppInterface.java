import java.util.ArrayList;
import java.util.List;

public class AppInterface {
    private final ArrayList<Category> categoryList = new ArrayList<>();

    public void addTask(String categoryId, Task task) {
        List<Category> filtered = categoryList.stream().filter(i -> i.getId().equals(categoryId)).toList();
        if (!filtered.isEmpty()) {
            filtered.get(0).getList().insertToList(task);
            System.out.println("Adding task " + task.getId() + " success to Category " + filtered.get(0).getName());
        } else {
            System.out.println("Error: No Category has been found!");
        }
    }

    public void editTask(Task oldTask, Task newTask) {
        for (Category category : categoryList) {
            if (category.getList().getAllContent().contains(oldTask)) {
                category.getList().editTaskInList(oldTask, newTask);
                System.out.println("Editing task " + newTask.getId() + " success from Category " + category.getName());
                break;
            }
        }
    }

    public void deleteTask(Task task) {
        // Array Ref is passed down and it will change the content of categoryList
        for (Category category : categoryList) {
            if (category.getList().getAllContent().contains(task)) {
                category.getList().removeFromList(task);
                System.out.println("Deleting task " + task.getId() + " success from Category " + category.getName());
                break;
            }
        }
    }

    public void markAsComplete(Task task, boolean isComplete) {
        for (Category category : categoryList) {
            if (category.getList().getAllContent().contains(task)) {
                category.getList().getSpecificTask(task.getId()).setTaskStatus(isComplete);
                System.out.println("Update task " + task.getId() + " completion to " + isComplete);
                break;
            }
        }
    }

    public void addCategory(Category category) {
        categoryList.add(category);
        System.out.println("Success Adding Category " + category.getId());
    }

    public void editCategory(Category category, String newName) {
        category.setName(newName);
        System.out.println("Success Edit Category to " + newName);
    }

    public void deleteCategory(Category category) {
        categoryList.remove(category);
        System.out.println("Success Deleting Category");
    }

    public Category getCategory(String id) {
        List<Category> filtered = categoryList.stream().filter(i -> i.getId().equals(id)).toList();
        if (!filtered.isEmpty()) {
            return filtered.get(0);
        } else {
            System.out.println("Error: No Category found!");
            return null;
        }
    }
}
