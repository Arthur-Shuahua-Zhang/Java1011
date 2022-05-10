package day4;

import java.util.function.Supplier;

public class FunctionalDemo {
    public static void main(String[] args) {
        Supplier<Double> generateRand = () -> Math.random();
        System.out.println(generateRand.get());
    }
}


@FunctionalInterface // optional
interface Sunday {
    public int method();

    default public void method9() {
        System.out.println();
    }
}
