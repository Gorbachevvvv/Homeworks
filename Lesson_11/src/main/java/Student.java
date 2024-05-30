import java.util.Collection;
import java.util.List;

public class Student {
    private String name;
    private String sex;
    private int age;
    private List<String> work;

    public Student(String Name, String Sex, int Age, List<String> Work)
    {
        name=Name;
        sex=Sex;
        age=Age;
        work=Work;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<String> getWork() {
        return work;
    }

    public void setWork(List<String> work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}

