public class RAM {
    private String name;
    private int capacity;

    public RAM() {
        this.name="NONE";
        this.capacity=0;
    }

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayInfo(){
        System.out.println("Название: " + getName());
        System.out.println("Память: " + getCapacity());
    }
}
