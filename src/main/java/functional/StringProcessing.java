package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProcessing {
    public static void main(String[] args) {
        List<String> numbers = List.of("3", "7", "1", "10",
                                        "5", "6", "2", "8", "9", "4",
                                        "0", "7", "3", "2", "8", "6",
                                        "4", "1", "5", "10");

        List<String> words = List.of("Java", "Programação", "Streams",
                                    "Lista", "Código",
                                    "Exemplo", "Desafio", "Função",
                                    "Média", "Palavra");

        // Convert to int and sum
        int sum = numbers.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);

        System.out.println(sum);

        // Verify if all strings have length > 5
        boolean all = words.stream()
                .allMatch(s -> s.length() > 5);

        System.out.println(all);

        // Concatenate strings
        String collect = words.stream()
                .collect(Collectors.joining(" "));

        System.out.println(collect);

        // Filter and concatenate
        String aWords = words.stream()
                .filter(w -> w.startsWith("P"))
                .collect(Collectors.joining(","));

        System.out.println(aWords);

        // Group by length
        Map<Integer, List<String>> groupLength = words.stream()
                .collect(Collectors.toMap(
                        s -> s.length(),
                        s -> new ArrayList(List.of(s)),
                        (oldList, newList) -> {
                            oldList.addAll(newList);
                            return oldList;
                        }
                ));
        /*
        // Alternative (with actual list):
        Map<Integer, List<String>> groupLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        */

        System.out.println(groupLength);

        // Count occurrences
        Map<String, Integer> mapCount = words.stream()
                .collect(Collectors.toMap(s -> s,
                        s -> 1,
                        Integer::sum));

        System.out.println(mapCount);
        /*
        // Alternative:
        Map<String, Long> mapCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

         */

    }
}
