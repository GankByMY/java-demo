package org.xielei.designpatterns.creational.prototype;

import org.junit.Test;
import org.xielei.designpatterns.creational.protoType.ProtoType;

public class ProtoTypeTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        ProtoType protoType = new ProtoType();
        ProtoType clone = (ProtoType) protoType.clone();

        System.out.println("realizeType == clone : " + (protoType.equals(clone)));
    }
}