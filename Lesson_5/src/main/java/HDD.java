public class HDD {
    private String name;
    private int capacity;

    private String type;

    public HDD() {
        this.name="NONE";
        this.capacity=0;
        this.type="Unknown";
    }

    public HDD(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void displayInfo(){
        System.out.println("Название: " + getName());
        System.out.println("Память: " + getCapacity());
        System.out.println("Тип: " + getType());
    }
}
