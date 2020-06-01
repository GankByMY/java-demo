package org.xielei.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author xielei
 */
public class IterateTest {

    public static void main(String[] args) {
        final Integer[] pre = {1};

        Stream.iterate(0, integer -> {
            int next = pre[0] + integer;
            pre[0] = integer;
            return next;
        })
                .skip(5)
                .limit(20)
                .forEach(System.out::println);
    }

    private static int[] rints = new Random(47).ints(0, 1000).limit(100).toArray();
    public static IntStream rands() {
        return Arrays.stream(rints);
    }
}
