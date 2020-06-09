package org.xielei.designpatterns.creational.factorymethod;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void newProduct() {
        // 具体工厂1 生产 具体产品1
        ConcreteFactoryOne concreteFactoryOne = new ConcreteFactoryOne();
        Product productOne = concreteFactoryOne.newProduct();

        // 具体工厂2 生产 具体产品2
        ConcreteFactoryTwo concreteFactoryTwo = new ConcreteFactoryTwo();
        Product productTwo = concreteFactoryTwo.newProduct();
    }
}