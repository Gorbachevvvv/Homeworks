public class Lesson_6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        cat myCat = new cat();
        myCat.setName("mycat");

        Person person1 = new Person("Alexsandr", 19, 3456.00, myCat);
        System.out.println(person1.toString());

        Person personClone = (Person) person1.clone();
        System.out.println(personClone.toString());

        personClone.setName("NotAlexsandr");
        System.out.println(personClone.toString());
        System.out.println(person1.equals(personClone));
    }
}
