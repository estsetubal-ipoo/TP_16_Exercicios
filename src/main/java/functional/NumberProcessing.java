package functional;

import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessing {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 7, 1, 10, 5,
                                    6, 2, 8, 9, 4,
                                    0, 7, 3, 2, 8,
                                    6, 4, 1, 5, 10);

        // Count uneven numbers
        long uneven = list.stream()
                .filter(n -> n % 2 != 0)
                .count();

        System.out.println(uneven);

        // sort unique numbers and take 5
        List<Integer> sorted = list.stream()
                .distinct()
                .sorted()
                .limit(5)
                .toList();

        System.out.println(sorted);

        // Compute max value
        Integer max = list.stream()
                .reduce(0, Math::max);

        System.out.println(max);

        // Average calculation
        double avg = list.stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        /*
        double avg = list.stream()
                .mapToInt(value -> value)
                .average()
                .orElse(0);
        */

        System.out.println(avg);

    }
}
