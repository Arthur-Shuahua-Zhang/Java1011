package day3;

import java.util.*;

public class KeywordDemo {



    public static void main(String[] args) {
        final int a = 2;
//        a = 3; // compile error
        final List<Integer> list = new ArrayList<>();
//        list = new ArrayList<>(); // compile error


        System.out.println(list.size());

    }
}


class A {
    final void method() {
        System.out.println("asf");
    }
}

class B extends A {
//    @Override
//    void method() {
//
//    }
}

final class C {}
//class D extends C {}



final class MyImmutableClass {
    private final int id;
    private final String name;
    private final Map<Integer, Integer> map;

    MyImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
        map = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Integer> getMap() {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }
}






















