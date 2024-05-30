import java.util.ArrayList;
import java.util.List;

public class Lesson_11 {
 public static void main(String[] args) {
  List<Student> students = new ArrayList<>();
  students.add(new Student("Евгений", "м", 25, List.of("математика", "программирование")));
  students.add(new Student("Полина", "ж", 19, List.of("математика")));
  students.add(new Student("Саша", "м", 20, List.of("математика", "танцы")));
  students.add(new Student("Степа", "м", 21, List.of( "программирование")));
  for (Student student : students) {
   if ("м".equals(student.getSex())) {
    System.out.println(student);
   }
  }
  System.out.println("   ");
  for (Student student : students) {
   if (student.getAge()>20) {
    System.out.println(student);
   }
  }

  System.out.println("   ");
  for (Student student : students) {
   if (student.getWork().size()<2) {
    System.out.println(student);
   }
  }


  System.out.println("   ");
  for (Student student : students) {
   if (student.getWork().contains("программирование")) {
    System.out.println(student);
   }
  }
 }
}
