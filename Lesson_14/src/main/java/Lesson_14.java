import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

public class Lesson_14 {
    public static void main(String[] args) {
        int n = 20;
        Map<Type, Integer> statistics = getNumberStatistics(n);
        System.out.println("Statistics: " + statistics);
    }

    public static Map<Type, Integer> getNumberStatistics(int n) {
        // Инициализируем переменные для подсчета
        AtomicInteger evenCount = new AtomicInteger(0);
        AtomicInteger oddCount = new AtomicInteger(0);
        AtomicInteger evenSum = new AtomicInteger(0);
        AtomicInteger oddSum = new AtomicInteger(0);

        IntStream.rangeClosed(1, n).forEach(num -> {
            if (num % 2 == 0) {
                evenCount.incrementAndGet();
                evenSum.addAndGet(num);
            } else {
                oddCount.incrementAndGet();
                oddSum.addAndGet(num);
            }
        });

        Map<Type, Integer> result = new HashMap<>();
        result.put(Type.EVEN_COUNT, evenCount.get());
        result.put(Type.ODD_COUNT, oddCount.get());
        result.put(Type.EVEN_SUM, evenSum.get());
        result.put(Type.ODD_SUM, oddSum.get());

        return result;
    }
}
