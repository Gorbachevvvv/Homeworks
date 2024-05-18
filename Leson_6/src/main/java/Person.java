import java.util.Objects;

public class  Person implements Cloneable {
    private String name;
    private int age;
    private double salary;
    private cat cat;

    public Person (String name, int age, double salary, cat cat)
    {
        this.name= name;
        this.age=age;
        this.salary=salary;
        this.cat=cat;

    }

    @Override
    public String toString() {
        return "Person:" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", salary = " + salary +
                ", cat = " + cat.getName() +
                ", Hashcode = '"+ this.hashCode()+
                "' ";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int result = this.name.length();
        result = age%result;
        result = (int)this.salary + result;
        result=result/7;
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(salary, person.salary) == 0 && Objects.equals(name, person.name) && Objects.equals(cat, person.cat);
    }
}
