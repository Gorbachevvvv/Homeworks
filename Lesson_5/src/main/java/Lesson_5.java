public class Lesson_5 {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1111, 11111.0);
        CreditCard card2 = new CreditCard(2222, 22222.0);
        CreditCard card3 = new CreditCard(3333, 33333.0);
        System.out.println("first card:");
        card1.pokaz();
        System.out.println("second card:");
        card2.pokaz();
        System.out.println("third card:");
        card3.pokaz();
        System.out.println("Processing...");
        card1.inc(9999);
        card2.inc(8888);
        card3.dec(3333);
        System.out.println("first card:");
        card1.pokaz();
        System.out.println("second card:");
        card2.pokaz();
        System.out.println("third card:");
        card3.pokaz();

        ///
        Computer comp1 = new Computer(50000, "first");
        comp1.displayInfo();
        System.out.println();
        RAM ram2=new RAM("ram2",8);
        HDD hdd2=new HDD("hdd2",8, "in");
        Computer comp2 = new Computer(22222, "second", ram2, hdd2);
        comp2.displayInfo();
    }
}
