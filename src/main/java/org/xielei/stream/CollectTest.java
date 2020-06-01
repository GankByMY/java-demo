package org.xielei.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xielei
 */
public class CollectTest {

    public static void main(String[] args) {
        new Random().ints(20, 0, 10).boxed()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-------------------------------------");

        Stream.generate(() -> new Random(47).ints(5, 20).limit(10))
                .map(intStream -> intStream.boxed().collect(Collectors.toList()))
                .limit(10)
                .forEach(integers -> System.out.println(integers.toString()));

        List<Object> arrayList = new ArrayList<>();

        List<Object> collect = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
