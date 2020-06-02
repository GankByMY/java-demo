package org.xielei.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IterateTestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fibonacci() {
        IterateTest.fibonacci(0, 1, null, null)
                .forEach(System.out::println);
    }

    @Test
    public void rands() {
        IterateTest.rands()
                .forEach(System.out::println);
    }
}