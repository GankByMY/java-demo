package org.xielei.designpatterns;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SingleTonTest {

    @Before
    public void setUp() throws Exception {
        SingleTon.LazySingleTon lazySingleTonNew = SingleTon.LazySingleTon.getLazySingleTon();
        System.out.println(lazySingleTonNew.hashCode());
    }

    @Test
    public void test() {
        SingleTon.LazySingleTon lazySingleTonOld = SingleTon.LazySingleTon.getLazySingleTon();
        System.out.println(lazySingleTonOld.hashCode());
    }

    @After
    public void tearDown() throws Exception {
    }
}