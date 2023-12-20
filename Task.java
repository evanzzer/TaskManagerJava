import java.util.Date;

public class Task {
    private final String id;
    private final String name;
    private final Date deadline;
    private boolean isCompleted = false;

    public Task(String name, Date deadline) {
        this.id = "T" + (System.currentTimeMillis() / 1000);
        this.name = name;
        this.deadline = deadline;
    }

    public Task(String id, String name, Date deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setTaskStatus(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
