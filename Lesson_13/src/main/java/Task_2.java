import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_2 {
    public static void main(String[] args) {
        // 1) Найти среднее значение первых 10 чисел
        double averageOfFirstTen = IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .average()
                .orElse(0.0);
        System.out.println("Average of first 10 numbers: " + averageOfFirstTen);

        // 2) Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка
        List<Integer> nextTenDivisibleByThree = IntStream.iterate(1, n -> n + 1)
                .skip(5)
                .filter(n -> n % 3 == 0)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Next 10 numbers divisible by 3 after skipping 5: " + nextTenDivisibleByThree);

        // 3) Посчитать сумму 20 подряд идущих чисел
        int sumOfTwentyNumbers = IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .sum();
        System.out.println("Sum of first 20 numbers: " + sumOfTwentyNumbers);
    }
}
