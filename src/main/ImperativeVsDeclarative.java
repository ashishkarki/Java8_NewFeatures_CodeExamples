package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);

        // Imperative style: say how you will achieve the result
        var uniqueSet = new HashSet<Integer>(intList);
        uniqueSet.forEach(System.out::println);

        // Declarative style: just say What do you want
        var uniqueSet2 = intList.stream()
                .distinct()
                .collect(Collectors.toSet());

        System.out.println(uniqueSet2);
    }
}
