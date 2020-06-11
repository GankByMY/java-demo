package org.xielei.designpatterns.creational.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SingleTonTest {

    @Before
    public void setUp() throws Exception {
        SingleTon.LazySingleTon lazySingleTonNew = SingleTon.LazySingleTon.getLazySingleTon();
        System.out.println("lazySingleTonNew: " + lazySingleTonNew.hashCode());

        SingleTon.HungrySingleTon hungrySingleTonNew = SingleTon.HungrySingleTon.getHungrySingleTon();
        System.out.println("hungrySingleTonNew: " + hungrySingleTonNew.hashCode());
    }

    @Test
    public void test() {
        System.out.println("----------------------");
        SingleTon.LazySingleTon lazySingleTonOld = SingleTon.LazySingleTon.getLazySingleTon();
        System.out.println("lazySingleTonOld: " + lazySingleTonOld.hashCode());

        SingleTon.HungrySingleTon hungrySingleTonOld = SingleTon.HungrySingleTon.getHungrySingleTon();
        System.out.println("hungrySingleTonOld: " + hungrySingleTonOld.hashCode());
    }

    @After
    public void tearDown() throws Exception {
    }
}