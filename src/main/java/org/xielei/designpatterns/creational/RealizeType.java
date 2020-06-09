package org.xielei.designpatterns.creational;

/**
 * 原型模式
 *
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 在这里，原型实例指定了要创建的对象的种类。
 * 用这种方式创建对象非常高效，根本无须知道对象创建的细节
 *
 * 原型模式包含以下主要角色。
 * 1. 抽象原型类：规定了具体原型对象必须实现的接口。
 * 2. 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 3. 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 *
 * 原型模式通常适用于以下场景。
 * 1. 对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 2. 对象的创建过程比较麻烦，但复制比较简单的时候。
 *
 * @author xielei
 * @date 2020/6/8
 **/
public class RealizeType implements Cloneable{

    public RealizeType() {
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
