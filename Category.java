public class Category {
    private final String id;
    private String name;
    private final TaskList list = new TaskList();

    public Category() {
        this.id = "C" + (System.currentTimeMillis() / 1000);
        this.name = "Uncategorized";
    }

    public Category(String name) {
        this.id = "C" + (System.currentTimeMillis() / 1000);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getList() {
        return list;
    }
}
