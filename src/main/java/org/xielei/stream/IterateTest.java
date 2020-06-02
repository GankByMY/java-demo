package org.xielei.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author xielei
 */
public class IterateTest {

    private static Integer[] PRE = new Integer[]{1};
    private static final Integer SEED = 0;

    /**
     * 生成一个斐波那挈数列
     * @param seed 首位
     * @param prev 第二位
     * @param skip 跳过
     * @param limit 长度
     * @return List<Integer>
     */
    public static List<Integer> fibonacci(Integer seed, Integer prev, Long skip, Long limit) {
        seed = seed == null ? SEED : seed;
        PRE[0] = prev == null ? PRE[0] : prev;
        skip = skip == null ? 0 : skip;
        limit = limit == null ? 10 : limit;

        return Stream.iterate(seed, integer -> {
            int next = PRE[0] + integer;
            PRE[0] = integer;
            return next;
        })
                .skip(skip)
                .limit(limit)
                .collect(Collectors.toList());
    }

    private static int[] rints = new Random(47)
            .ints(0, 1000)
            .limit(100)
            .toArray();

    public static IntStream rands() {
        return Arrays.stream(rints);
    }
}
