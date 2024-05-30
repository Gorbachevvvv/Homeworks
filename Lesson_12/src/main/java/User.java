import java.util.List;

class User {
    private String name;
    private int experience;
    private List<String> tasks;

    public User(String name, int experience, List<String> tasks) {
        this.name = name;
        this.experience = experience;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', experience=" + experience + ", tasks=" + tasks + '}';
    }
}