package main.defaults;

import java.util.List;

public class MultiplierImpl implements IMultiplier {

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    @Override
    public int size(List<Integer> integerList) {
        return (integerList.size() > 10 ? 1 : 0); // just to show difference with the interface default method
    }
}
