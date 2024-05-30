import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lesson_12 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Саша", 5, Arrays.asList("Task1", "Task2", "Task3")));
        users.add(new User("Маша", 3, Arrays.asList("Task1")));
        users.add(new User("Даша", 7, Arrays.asList("Task1", "Task2")));
        users.add(new User("Степа", 10, Arrays.asList("Task1", "Task2", "Task3", "Task4")));
        users.add(new User("Полина", 2, Arrays.asList("Task1", "Task2", "Task3")));

        List<User> usersWithMoreThanTwoTasks = users.stream()
                .filter(user -> user.getTasks().size() > 2)
                .collect(Collectors.toList());

        System.out.println("Users with more than 2 tasks:");
        usersWithMoreThanTwoTasks.forEach(System.out::println);

        List<User> sortedByExperience = users.stream()
                .sorted((u1, u2) -> Integer.compare(u2.getExperience(), u1.getExperience()))
                .collect(Collectors.toList());

        System.out.println("\nUsers sorted by experience (desc):");
        sortedByExperience.forEach(System.out::println);

        Set<String> uniqueNames = users.stream()
                .map(User::getName)
                .collect(Collectors.toSet());

        System.out.println("\nUnique user names:");
        uniqueNames.forEach(System.out::println);
    }

}
