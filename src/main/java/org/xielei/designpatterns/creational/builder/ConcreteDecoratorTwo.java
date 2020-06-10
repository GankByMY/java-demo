package org.xielei.designpatterns.creational.builder;

/**
 * ConcreteDecoratorOne
 *
 * 具体建造者
 *
 * @author xielei
 * @date 2020/6/10
 **/
public class ConcreteDecoratorTwo extends Decorator {

    @Override
    void buildWall() {
        room.setWall("wall two");
        System.out.println("decoratorTwo build wall...");
    }

    @Override
    void buildTV() {
        room.setTV("tv two");
        System.out.println("decoratorTwo build TV...");
    }

    @Override
    void buildSofa() {
        room.setSofa("sofa two");
        System.out.println("decoratorTwo build sofa...");
    }
}
