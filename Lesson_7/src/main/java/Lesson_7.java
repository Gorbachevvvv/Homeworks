public class Lesson_7 {
    public static void main (String Args[]){
        User user1=new User("user1", User.Profession.HR,10);
        User user2=new User("user2", User.Profession.DIRECTOR,3);
        User user3=new User("user2", User.Profession.WORKER,15);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println("Зарплата "+user1.getName()+" = "+user1.calculate()+".");
        System.out.println("Зарплата "+user2.getName()+" = "+user2.calculate(194)+".");
        System.out.println("Зарплата "+user3.getName()+" = "+user3.calculate(12000)+".");
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        cat1.doVoice();
        dog1.doVoice();
    }
}
