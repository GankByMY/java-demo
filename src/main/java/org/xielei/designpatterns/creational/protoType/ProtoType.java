package org.xielei.designpatterns.creational.protoType;

/**
 * 原型模式
 *
 * @author xielei
 * @date 2020/6/8
 **/
public class ProtoType implements Cloneable{

    public ProtoType() {
        System.out.println("RealizeType create");
    }

    /**
     * 浅克隆
     *
     * @return Object
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("clone realizeType");
        return super.clone();
    }
}
