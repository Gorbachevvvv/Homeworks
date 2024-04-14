public class Computer {
    int stoim;
    String model;
    private RAM ram;
    private HDD hdd;

    public Computer(int stoim, String model) {
        this.stoim = stoim;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int stoim, String model, RAM ram, HDD hdd) {
        this.stoim = stoim;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void displayInfo(){
        System.out.println("Стоимость: " + stoim);
        System.out.println("Модель: " + model);
       ram.displayInfo();
       hdd.displayInfo();
    }
}
