package org.xielei.designpatterns;

import org.junit.Test;

import static org.junit.Assert.*;

public class RealizeTypeTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = (RealizeType) realizeType.clone();

        System.out.println("realizeType == clone : " + (realizeType.equals(clone)));
    }
}