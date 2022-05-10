package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalDemo {
    public static void main(String[] args) {
//        // NPE
//        String str = null;
//
//        if (str == null) {
//            System.out.println("it is null value");
//        } else {
//            System.out.println(str);
//        }
//
//        Optional<String> opt = Optional.ofNullable(str);
//        System.out.println(opt.orElse("it is null value"));

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 3,2, 1));
//        list.stream().filter(e -> e>2).collect(Collectors.toList());
        System.out.println(list.stream().filter(e -> e>2).distinct().collect(Collectors.toList())); // C




    }
}
