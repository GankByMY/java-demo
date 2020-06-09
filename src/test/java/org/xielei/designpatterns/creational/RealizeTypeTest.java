package org.xielei.designpatterns.creational;

import org.junit.Test;
import org.xielei.designpatterns.creational.RealizeType;

public class RealizeTypeTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = (RealizeType) realizeType.clone();

        System.out.println("realizeType == clone : " + (realizeType.equals(clone)));
    }
}