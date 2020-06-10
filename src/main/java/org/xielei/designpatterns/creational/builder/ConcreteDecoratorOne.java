package org.xielei.designpatterns.creational.builder;

/**
 * ConcreteDecoratorOne
 *
 * 具体建造者
 *
 * @author xielei
 * @date 2020/6/10
 **/
public class ConcreteDecoratorOne extends Decorator {

    @Override
    void buildWall() {
        room.setWall("wall one");
        System.out.println("decoratorOne build wall...");
    }

    @Override
    void buildTV() {
        room.setTV("tv one");
        System.out.println("decoratorOne build TV...");
    }

    @Override
    void buildSofa() {
        room.setSofa("sofa one");
        System.out.println("decoratorOne build sofa...");
    }
}
